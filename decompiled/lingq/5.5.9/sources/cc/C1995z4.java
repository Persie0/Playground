package cc;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;
import p176ib.C6272i;
import p262mb.InterfaceC7528a;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.z4 */
/* JADX INFO: loaded from: classes.dex */
public class C1995z4 implements InterfaceC1781b5, InterfaceC1891n7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1781b5 f10430a;

    public C1995z4(C1897o4 c1897o4) {
        C6272i.m12915i(c1897o4);
        this.f10430a = c1897o4;
    }

    public C1995z4(C1934s5 c1934s5) {
        this.f10430a = c1934s5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1891n7
    /* JADX INFO: renamed from: a */
    public final void mo5572a(String str, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (!zIsEmpty) {
            ((C1934s5) interfaceC1781b5).getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        C1934s5 c1934s5 = (C1934s5) interfaceC1781b5;
        ((C1897o4) c1934s5.f10430a).f10058I.getClass();
        c1934s5.m5870n("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: b */
    public final InterfaceC7528a mo5514b() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: c */
    public final C8573r0 mo5515c() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: d */
    public final Context mo5516d() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: e */
    public final C1860k3 mo5517e() {
        throw null;
    }

    @Override // cc.InterfaceC1781b5
    @Pure
    /* JADX INFO: renamed from: f */
    public final C1879m4 mo5518f() {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public void mo5748g() {
        C1879m4 c1879m4 = ((C1897o4) this.f10430a).f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.mo5748g();
    }
}
