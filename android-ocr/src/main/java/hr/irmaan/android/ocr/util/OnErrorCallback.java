package hr.irmaan.android.ocr.util;

public interface OnErrorCallback {
    void execute(Throwable throwable, int stringResourceId);
}
