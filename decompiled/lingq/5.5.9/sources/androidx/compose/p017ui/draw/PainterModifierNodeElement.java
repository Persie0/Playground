package androidx.compose.p017ui.draw;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.InterfaceC0500b;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p127g1.InterfaceC5639c;
import p166i1.AbstractC6165t;
import p166i1.C6139d;
import p166i1.C6145g;
import p284o0.InterfaceC7885a;
import p375s0.C8944f;
import p387t0.C9170v;
import p444w0.AbstractC9790b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/draw/PainterModifierNodeElement;", "Li1/t;", "Landroidx/compose/ui/draw/PainterModifierNode;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class PainterModifierNodeElement extends AbstractC6165t<PainterModifierNode> {

    /* JADX INFO: renamed from: a */
    public final AbstractC9790b f3346a;

    /* JADX INFO: renamed from: b */
    public final boolean f3347b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7885a f3348c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5639c f3349d;

    /* JADX INFO: renamed from: e */
    public final float f3350e;

    /* JADX INFO: renamed from: f */
    public final C9170v f3351f;

    public PainterModifierNodeElement(AbstractC9790b abstractC9790b, boolean z10, InterfaceC7885a interfaceC7885a, InterfaceC5639c interfaceC5639c, float f3, C9170v c9170v) {
        C5207g.m11111f(abstractC9790b, "painter");
        this.f3346a = abstractC9790b;
        this.f3347b = z10;
        this.f3348c = interfaceC7885a;
        this.f3349d = interfaceC5639c;
        this.f3350e = f3;
        this.f3351f = c9170v;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new PainterModifierNode(this.f3346a, this.f3347b, this.f3348c, this.f3349d, this.f3350e, this.f3351f);
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: d */
    public final boolean mo1947d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterModifierNodeElement)) {
            return false;
        }
        PainterModifierNodeElement painterModifierNodeElement = (PainterModifierNodeElement) obj;
        if (C5207g.m11106a(this.f3346a, painterModifierNodeElement.f3346a) && this.f3347b == painterModifierNodeElement.f3347b && C5207g.m11106a(this.f3348c, painterModifierNodeElement.f3348c) && C5207g.m11106a(this.f3349d, painterModifierNodeElement.f3349d) && Float.compare(this.f3350e, painterModifierNodeElement.f3350e) == 0 && C5207g.m11106a(this.f3351f, painterModifierNodeElement.f3351f)) {
            return true;
        }
        return false;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        PainterModifierNode painterModifierNode = (PainterModifierNode) cVar;
        C5207g.m11111f(painterModifierNode, "node");
        boolean z10 = painterModifierNode.f3344l;
        AbstractC9790b abstractC9790b = this.f3346a;
        boolean z11 = this.f3347b;
        boolean z12 = z10 != z11 || (z11 && !C8944f.m17174a(painterModifierNode.f3343k.mo2009c(), abstractC9790b.mo2009c()));
        C5207g.m11111f(abstractC9790b, "<set-?>");
        painterModifierNode.f3343k = abstractC9790b;
        painterModifierNode.f3344l = z11;
        InterfaceC7885a interfaceC7885a = this.f3348c;
        C5207g.m11111f(interfaceC7885a, "<set-?>");
        painterModifierNode.f3339H = interfaceC7885a;
        InterfaceC5639c interfaceC5639c = this.f3349d;
        C5207g.m11111f(interfaceC5639c, "<set-?>");
        painterModifierNode.f3340I = interfaceC5639c;
        painterModifierNode.f3341J = this.f3350e;
        painterModifierNode.f3342K = this.f3351f;
        if (z12) {
            C6139d.m12652e(painterModifierNode).m2134x();
        }
        C6145g.m12654a(painterModifierNode);
        return painterModifierNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    public final int hashCode() {
        int iHashCode = this.f3346a.hashCode() * 31;
        boolean z10 = this.f3347b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM846e = C0204c.m846e(this.f3350e, (this.f3349d.hashCode() + ((this.f3348c.hashCode() + ((iHashCode + r10) * 31)) * 31)) * 31, 31);
        C9170v c9170v = this.f3351f;
        return iM846e + (c9170v == null ? 0 : c9170v.hashCode());
    }

    public final String toString() {
        return "PainterModifierNodeElement(painter=" + this.f3346a + ", sizeToIntrinsics=" + this.f3347b + ", alignment=" + this.f3348c + ", contentScale=" + this.f3349d + ", alpha=" + this.f3350e + ", colorFilter=" + this.f3351f + ')';
    }
}
