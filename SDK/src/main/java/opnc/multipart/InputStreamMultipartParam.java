package opnc.multipart;

import java.io.InputStream;

/**
 * @desc:
 * @fileName: InputStreamMultipartParam
 * @author: tangjiaxiang
 * @createTime: 2020/12/1 17:32:32
 * @modifier:
 */
public class InputStreamMultipartParam implements MultipartParam {

    /**
     * 参数名
     */
    private String name;
    /**
     * 文件流
     */
    private InputStream inputStream;
    /**
     * 文件名
     */
    private String filename;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
