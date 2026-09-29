package androidx.compose.p017ui.graphics;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p166i1.AbstractC6165t;
import p387t0.InterfaceC9172x;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m13365d2 = {"Landroidx/compose/ui/graphics/BlockGraphicsLayerElement;", "Li1/t;", "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;", "ui_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final /* data */ class BlockGraphicsLayerElement extends AbstractC6165t<BlockGraphicsLayerModifier> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2052l<InterfaceC9172x, C9072e> f3409a;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockGraphicsLayerElement(InterfaceC2052l<? super InterfaceC9172x, C9072e> interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "block");
        this.f3409a = interfaceC2052l;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: c */
    public final InterfaceC0500b.c mo1935c() {
        return new BlockGraphicsLayerModifier(this.f3409a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BlockGraphicsLayerElement) && C5207g.m11106a(this.f3409a, ((BlockGraphicsLayerElement) obj).f3409a)) {
            return true;
        }
        return false;
    }

    @Override // p166i1.AbstractC6165t
    /* JADX INFO: renamed from: h */
    public final InterfaceC0500b.c mo1936h(InterfaceC0500b.c cVar) {
        BlockGraphicsLayerModifier blockGraphicsLayerModifier = (BlockGraphicsLayerModifier) cVar;
        C5207g.m11111f(blockGraphicsLayerModifier, "node");
        InterfaceC2052l<InterfaceC9172x, C9072e> interfaceC2052l = this.f3409a;
        C5207g.m11111f(interfaceC2052l, "<set-?>");
        blockGraphicsLayerModifier.f3410k = interfaceC2052l;
        return blockGraphicsLayerModifier;
    }

    public final int hashCode() {
        return this.f3409a.hashCode();
    }

    public final String toString() {
        return "BlockGraphicsLayerElement(block=" + this.f3409a + ')';
    }
}
