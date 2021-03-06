/*
Copyright (c) 2009 Pawel Gdula <pawel.gdula@burningice.pl>

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package pl.burningice.plugins.image.file

import org.springframework.web.multipart.MultipartFile
import org.javatuples.Pair

/**
 * Produce ImageFile object depends on source
 *
 * @author pawel.gdula@burningice.pl
 */
class ImageFileFactory {

    /**
     * Overloaded method that will produce LocalImageFile
     *
     * @param File source
     * @return ImageFile
     */
    static ImageFile produce(File source) {
        new LocalImageFile(source)
    }

    /**
     * Overloaded method that will produce MultipartImageFile
     *
     * @param File source
     * @return ImageFile
     */
    static ImageFile produce(MultipartFile source) {
        new MultipartImageFile(source)
    }

    /**
     * Overloade method that will produce BytemapImageFile
     * @param bute[] source
     * @return ImageFile
     */
    static ImageFile produce(byte[] source){
        new BytemapImageFile(source)
    }

    static ImageFile produce(Pair<String, byte[]> source){
        new BytemapImageFile(source)
    }
}

