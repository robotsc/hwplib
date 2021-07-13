package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.form.FormObject;
import kr.dogfoot.hwplib.util.compoundFile.reader.StreamReader;

/**
 * 양식 개체 컨트롤
 *
 * @author neolord
 */
public class ControlForm extends Control {
    private FormObject formObject;

    /**
     * 생성자
     * @param header
     * @param sr
     */
    public ControlForm(CtrlHeaderGso header, StreamReader sr) {
        this(new CtrlHeaderGso(ControlType.Form));
    }

    /**
     * 생상자
     *
     * @param header 양식 개체를 위한 컨트롤 헤더
     */
    public ControlForm(CtrlHeaderGso header) {
        super(header);

        formObject = new FormObject();
    }

    public CtrlHeaderGso getHeader() {
        return (CtrlHeaderGso) header;
    }

    public FormObject getFormObject() {
        return formObject;
    }

    @Override
    public Control clone() {
        return null;
    }

}
