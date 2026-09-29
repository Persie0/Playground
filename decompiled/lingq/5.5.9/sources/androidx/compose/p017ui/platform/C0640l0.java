package androidx.compose.p017ui.platform;

import androidx.compose.runtime.saveable.C0489c;
import androidx.compose.runtime.saveable.InterfaceC0488b;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.List;
import java.util.Map;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0640l0 implements InterfaceC0488b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<C9072e> f4323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0488b f4324b;

    public C0640l0(C0489c c0489c, InterfaceC2041a interfaceC2041a) {
        this.f4323a = interfaceC2041a;
        this.f4324b = c0489c;
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: a */
    public final boolean mo1861a(Object obj) {
        return this.f4324b.mo1861a(obj);
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: b */
    public final Map<String, List<Object>> mo1862b() {
        return this.f4324b.mo1862b();
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: c */
    public final Object mo1863c(String str) {
        C5207g.m11111f(str, "key");
        return this.f4324b.mo1863c(str);
    }

    @Override // androidx.compose.runtime.saveable.InterfaceC0488b
    /* JADX INFO: renamed from: d */
    public final InterfaceC0488b.a mo1864d(String str, InterfaceC2041a<? extends Object> interfaceC2041a) {
        C5207g.m11111f(str, "key");
        return this.f4324b.mo1864d(str, interfaceC2041a);
    }
}
