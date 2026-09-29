package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p351r0.C8693l;
import p351r0.InterfaceC8691j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Li1/t;", "Lr0/l;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class FocusPropertiesElement extends AbstractC6165t<C8693l> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC8691j, C9072e> f3372a;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusPropertiesElement(InterfaceC2052l<? super InterfaceC8691j, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "scope");
        this.f3372a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C8693l(this.f3372a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && C5207g.m11106a(this.f3372a, ((FocusPropertiesElement) obj).f3372a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C8693l c8693l = (C8693l) cVar;
        C5207g.m11111f(c8693l, "node");
        InterfaceC2052l<InterfaceC8691j, C9072e> interfaceC2052l = this.f3372a;
        C5207g.m11111f(interfaceC2052l, "<set-?>");
        c8693l.f46279k = interfaceC2052l;
        return c8693l;
    }

    public final int hashCode() {
        return this.f3372a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f3372a + ')';
    }
}
