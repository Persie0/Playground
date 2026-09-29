package p288o4;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: renamed from: o4.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7916b extends Closeable {
    /* JADX INFO: renamed from: B */
    InterfaceC7920f mo4588B(String str);

    /* JADX INFO: renamed from: S0 */
    boolean mo4589S0();

    /* JADX INFO: renamed from: Z */
    void mo4590Z();

    /* JADX INFO: renamed from: a0 */
    void mo4592a0(String str, Object[] objArr) throws SQLException;

    /* JADX INFO: renamed from: b1 */
    Cursor mo4594b1(InterfaceC7919e interfaceC7919e);

    /* JADX INFO: renamed from: c0 */
    void mo4595c0();

    /* JADX INFO: renamed from: f1 */
    boolean mo4596f1();

    boolean isOpen();

    /* JADX INFO: renamed from: k */
    void mo4597k();

    /* JADX INFO: renamed from: o0 */
    Cursor mo4599o0(String str);

    /* JADX INFO: renamed from: u */
    void mo4600u(String str) throws SQLException;

    /* JADX INFO: renamed from: w0 */
    void mo4601w0();

    /* JADX INFO: renamed from: y */
    Cursor mo4602y(InterfaceC7919e interfaceC7919e, CancellationSignal cancellationSignal);
}
