package androidx.media3.exoplayer.source;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UnrecognizedInputFormatException extends ParserException {

    /* JADX INFO: renamed from: c */
    public final ImmutableList f6460c;

    public UnrecognizedInputFormatException(String str, List list) {
        super(str, null, false, 1);
        this.f6460c = ImmutableList.m6287r(list);
    }

    @Override // androidx.media3.common.ParserException, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        ImmutableList immutableList = this.f6460c;
        if (immutableList.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + immutableList;
    }
}
