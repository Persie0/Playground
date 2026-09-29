package androidx.compose.p017ui.input.rotary;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p106f1.C5460b;
import p106f1.C5461c;
import p166i1.AbstractC6165t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/input/rotary/OnRotaryScrollEventElement;", "Li1/t;", "Lf1/b;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class OnRotaryScrollEventElement extends AbstractC6165t<C5460b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<C5461c, Boolean> f3659a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnRotaryScrollEventElement(InterfaceC2052l<? super C5461c, Boolean> interfaceC2052l) {
        this.f3659a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C5460b(this.f3659a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OnRotaryScrollEventElement) && C5207g.m11106a(this.f3659a, ((OnRotaryScrollEventElement) obj).f3659a)) {
            return true;
        }
        return false;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C5460b c5460b = (C5460b) cVar;
        C5207g.m11111f(c5460b, "node");
        c5460b.f34026k = this.f3659a;
        c5460b.f34027l = null;
        return c5460b;
    }

    public final int hashCode() {
        return this.f3659a.hashCode();
    }

    public final String toString() {
        return "OnRotaryScrollEventElement(onRotaryScrollEvent=" + this.f3659a + ')';
    }
}
