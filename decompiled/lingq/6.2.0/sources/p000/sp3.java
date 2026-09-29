package p000;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* JADX INFO: loaded from: classes.dex */
public final class sp3 {

    /* JADX INFO: renamed from: A */
    public int f61148A;

    /* JADX INFO: renamed from: B */
    public boolean f61149B;

    /* JADX INFO: renamed from: C */
    public boolean f61150C;

    /* JADX INFO: renamed from: D */
    public int f61151D;

    /* JADX INFO: renamed from: E */
    public int f61152E;

    /* JADX INFO: renamed from: F */
    public yd0 f61153F;

    /* JADX INFO: renamed from: G */
    public int f61154G;

    /* JADX INFO: renamed from: a */
    public final bn0 f61155a;

    /* JADX INFO: renamed from: b */
    public final an0 f61156b;

    /* JADX INFO: renamed from: c */
    public final RenderNode f61157c;

    /* JADX INFO: renamed from: d */
    public long f61158d;

    /* JADX INFO: renamed from: e */
    public Paint f61159e;

    /* JADX INFO: renamed from: f */
    public Matrix f61160f;

    /* JADX INFO: renamed from: g */
    public boolean f61161g;

    /* JADX INFO: renamed from: h */
    public float f61162h;

    /* JADX INFO: renamed from: i */
    public int f61163i;

    /* JADX INFO: renamed from: j */
    public fa1 f61164j;

    /* JADX INFO: renamed from: k */
    public long f61165k;

    /* JADX INFO: renamed from: l */
    public float f61166l;

    /* JADX INFO: renamed from: m */
    public float f61167m;

    /* JADX INFO: renamed from: n */
    public float f61168n;

    /* JADX INFO: renamed from: o */
    public float f61169o;

    /* JADX INFO: renamed from: p */
    public float f61170p;

    /* JADX INFO: renamed from: q */
    public long f61171q;

    /* JADX INFO: renamed from: r */
    public long f61172r;

    /* JADX INFO: renamed from: s */
    public float f61173s;

    /* JADX INFO: renamed from: t */
    public float f61174t;

    /* JADX INFO: renamed from: u */
    public float f61175u;

    /* JADX INFO: renamed from: v */
    public float f61176v;

    /* JADX INFO: renamed from: w */
    public boolean f61177w;

    /* JADX INFO: renamed from: x */
    public int f61178x;

    /* JADX INFO: renamed from: y */
    public int f61179y;

    /* JADX INFO: renamed from: z */
    public int f61180z;

    public sp3() {
        bn0 bn0Var = new bn0();
        an0 an0Var = new an0();
        this.f61155a = bn0Var;
        this.f61156b = an0Var;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f61157c = renderNode;
        this.f61158d = 0L;
        renderNode.setClipToBounds(false);
        m21527b(renderNode, 0);
        this.f61162h = 1.0f;
        this.f61163i = 3;
        this.f61165k = 9205357640488583168L;
        this.f61166l = 1.0f;
        this.f61167m = 1.0f;
        long j = aa1.f403b;
        this.f61171q = j;
        this.f61172r = j;
        this.f61176v = 8.0f;
        this.f61154G = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m21526a() {
        boolean z = this.f61177w;
        boolean z2 = false;
        boolean z3 = z && !this.f61161g;
        if (z && this.f61161g) {
            z2 = true;
        }
        boolean z4 = this.f61149B;
        RenderNode renderNode = this.f61157c;
        if (z3 != z4) {
            this.f61149B = z3;
            renderNode.setClipToBounds(z3);
        }
        if (z2 != this.f61150C) {
            this.f61150C = z2;
            renderNode.setClipToOutline(z2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21527b(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, this.f61159e);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        Paint paint = this.f61159e;
        if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21528c() {
        int i = this.f61154G;
        RenderNode renderNode = this.f61157c;
        if (i != 1 && this.f61163i == 3 && this.f61164j == null && this.f61153F == null) {
            m21527b(renderNode, i);
        } else {
            m21527b(renderNode, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21529d() {
        long j = this.f61165k;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.f61157c;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.f61158d >> 32)) / 2.0f) + this.f61178x);
            renderNode.setPivotY((Float.intBitsToFloat((int) (this.f61158d & 4294967295L)) / 2.0f) + this.f61179y);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.f61178x);
            renderNode.setPivotY(Float.intBitsToFloat((int) (this.f61165k & 4294967295L)) + this.f61179y);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21530e() {
        int i = this.f61151D;
        this.f61157c.setPosition(i - this.f61178x, this.f61152E - this.f61179y, i + ((int) Float.intBitsToFloat((int) (this.f61158d >> 32))) + this.f61180z, this.f61152E + ((int) Float.intBitsToFloat((int) (this.f61158d & 4294967295L))) + this.f61148A);
    }
}
