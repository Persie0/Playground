package androidx.compose.p017ui.platform;

import android.view.RenderNode;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612c1 {

    /* JADX INFO: renamed from: a */
    public static final C0612c1 f4291a = new C0612c1();

    /* JADX INFO: renamed from: a */
    public final int m2341a(RenderNode renderNode) {
        C5207g.m11111f(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    /* JADX INFO: renamed from: b */
    public final int m2342b(RenderNode renderNode) {
        C5207g.m11111f(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    /* JADX INFO: renamed from: c */
    public final void m2343c(RenderNode renderNode, int i10) {
        C5207g.m11111f(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    /* JADX INFO: renamed from: d */
    public final void m2344d(RenderNode renderNode, int i10) {
        C5207g.m11111f(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
