package androidx.compose.p017ui.focus;

import androidx.compose.p017ui.InterfaceC0500b;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p351r0.C8696o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Li1/t;", "Lr0/o;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class FocusRequesterElement extends AbstractC6165t<C8696o> {

    /* JADX INFO: renamed from: a */
    public final FocusRequester f3390a;

    public FocusRequesterElement(FocusRequester focusRequester) {
        C5207g.m11111f(focusRequester, "focusRequester");
        this.f3390a = focusRequester;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new C8696o(this.f3390a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && C5207g.m11106a(this.f3390a, ((FocusRequesterElement) obj).f3390a);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        C8696o c8696o = (C8696o) cVar;
        C5207g.m11111f(c8696o, "node");
        c8696o.f46280k.f3388a.m11696m(c8696o);
        FocusRequester focusRequester = this.f3390a;
        C5207g.m11111f(focusRequester, "<set-?>");
        c8696o.f46280k = focusRequester;
        focusRequester.f3388a.m11687b(c8696o);
        return c8696o;
    }

    public final int hashCode() {
        return this.f3390a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f3390a + ')';
    }
}
