package androidx.compose.p017ui.draw;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p327q0.C8457c;
import p424v0.InterfaceC9621e;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Li1/t;", "Lq0/c;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class DrawBehindElement extends AbstractC6165t<C8457c> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC9621e, C9072e> f3336a;

    /* JADX WARN: Multi-variable type inference failed */
    public DrawBehindElement(InterfaceC2052l<? super InterfaceC9621e, C9072e> interfaceC2052l) {
        this.f3336a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C8457c(this.f3336a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawBehindElement) && C5207g.m11106a(this.f3336a, ((DrawBehindElement) obj).f3336a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C8457c c8457c = (C8457c) cVar;
        C5207g.m11111f(c8457c, "node");
        InterfaceC2052l<InterfaceC9621e, C9072e> interfaceC2052l = this.f3336a;
        C5207g.m11111f(interfaceC2052l, "<set-?>");
        c8457c.f45629k = interfaceC2052l;
        return c8457c;
    }

    public final int hashCode() {
        return this.f3336a.hashCode();
    }

    public final String toString() {
        return "DrawBehindElement(onDraw=" + this.f3336a + ')';
    }
}
