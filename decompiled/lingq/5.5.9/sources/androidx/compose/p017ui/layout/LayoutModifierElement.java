package androidx.compose.p017ui.layout;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p127g1.C5648l;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p166i1.AbstractC6165t;
import p470x1.C10013a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/layout/LayoutModifierElement;", "Li1/t;", "Lg1/l;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class LayoutModifierElement extends AbstractC6165t<C5648l> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2057q<InterfaceC0524e, InterfaceC5651o, C10013a, InterfaceC5653q> f3667a;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutModifierElement(InterfaceC2057q<? super InterfaceC0524e, ? super InterfaceC5651o, ? super C10013a, ? extends InterfaceC5653q> interfaceC2057q) {
        C5207g.m11111f(interfaceC2057q, "measure");
        this.f3667a = interfaceC2057q;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C5648l(this.f3667a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutModifierElement) && C5207g.m11106a(this.f3667a, ((LayoutModifierElement) obj).f3667a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C5648l c5648l = (C5648l) cVar;
        C5207g.m11111f(c5648l, "node");
        InterfaceC2057q<InterfaceC0524e, InterfaceC5651o, C10013a, InterfaceC5653q> interfaceC2057q = this.f3667a;
        C5207g.m11111f(interfaceC2057q, "<set-?>");
        c5648l.f34492k = interfaceC2057q;
        return c5648l;
    }

    public final int hashCode() {
        return this.f3667a.hashCode();
    }

    public final String toString() {
        return "LayoutModifierElement(measure=" + this.f3667a + ')';
    }
}
