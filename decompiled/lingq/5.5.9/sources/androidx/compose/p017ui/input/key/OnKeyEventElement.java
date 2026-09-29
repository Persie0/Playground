package androidx.compose.p017ui.input.key;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p022b1.C1289b;
import p022b1.C1290c;
import p166i1.AbstractC6165t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/input/key/OnKeyEventElement;", "Li1/t;", "Lb1/c;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class OnKeyEventElement extends AbstractC6165t<C1290c> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<C1289b, Boolean> f3577a;

    /* JADX WARN: Multi-variable type inference failed */
    public OnKeyEventElement(InterfaceC2052l<? super C1289b, Boolean> interfaceC2052l) {
        this.f3577a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C1290c(this.f3577a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnKeyEventElement) && C5207g.m11106a(this.f3577a, ((OnKeyEventElement) obj).f3577a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C1290c c1290c = (C1290c) cVar;
        C5207g.m11111f(c1290c, "node");
        c1290c.f8001k = this.f3577a;
        c1290c.f8002l = null;
        return c1290c;
    }

    public final int hashCode() {
        return this.f3577a.hashCode();
    }

    public final String toString() {
        return "OnKeyEventElement(onKeyEvent=" + this.f3577a + ')';
    }
}
