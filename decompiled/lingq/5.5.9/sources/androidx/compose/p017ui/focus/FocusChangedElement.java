package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p351r0.C8683b;
import p351r0.InterfaceC8697p;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Li1/t;", "Lr0/b;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class FocusChangedElement extends AbstractC6165t<C8683b> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC8697p, C9072e> f3357a;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(InterfaceC2052l<? super InterfaceC8697p, C9072e> interfaceC2052l) {
        this.f3357a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C8683b(this.f3357a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && C5207g.m11106a(this.f3357a, ((FocusChangedElement) obj).f3357a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C8683b c8683b = (C8683b) cVar;
        C5207g.m11111f(c8683b, "node");
        InterfaceC2052l<InterfaceC8697p, C9072e> interfaceC2052l = this.f3357a;
        C5207g.m11111f(interfaceC2052l, "<set-?>");
        c8683b.f46275k = interfaceC2052l;
        return c8683b;
    }

    public final int hashCode() {
        return this.f3357a.hashCode();
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.f3357a + ')';
    }
}
