package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mjs extends mjw {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f40769c = 0;

    /* JADX INFO: renamed from: j */
    private static final aiu f40770j = new mjr();

    /* JADX INFO: renamed from: a */
    public final mjx f40771a;

    /* JADX INFO: renamed from: b */
    public float f40772b;

    /* JADX INFO: renamed from: k */
    private final aiw f40773k;

    /* JADX INFO: renamed from: l */
    private final aiv f40774l;

    /* JADX INFO: renamed from: m */
    private boolean f40775m;

    public mjs(Context context, mjj mjjVar, mjx mjxVar) {
        super(context, mjjVar);
        this.f40775m = false;
        this.f40771a = mjxVar;
        mjxVar.f40789b = this;
        aiw aiwVar = new aiw();
        this.f40773k = aiwVar;
        aiwVar.m791c(1.0f);
        aiwVar.m793e(50.0f);
        aiv aivVar = new aiv(this, f40770j);
        this.f40774l = aivVar;
        aivVar.f461q = aiwVar;
        m16470e(1.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m16464a(float f) {
        this.f40772b = f;
        invalidateSelf();
    }

    @Override // p000.mjw
    /* JADX INFO: renamed from: b */
    public final boolean mo16465b(boolean z, boolean z2, boolean z3) {
        boolean zMo16465b = super.mo16465b(z, z2, z3);
        float fM15397E = lij.m15397E(this.f40781d.getContentResolver());
        if (fM15397E == 0.0f) {
            this.f40775m = true;
        } else {
            this.f40775m = false;
            this.f40773k.m793e(50.0f / fM15397E);
        }
        return zMo16465b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f40771a.m16476f(canvas, getBounds(), m16468c());
            this.f40771a.mo16458e(canvas, this.f40785h);
            this.f40771a.mo16457d(canvas, this.f40785h, 0.0f, this.f40772b, kxk.m15023p(this.f40782e.f40743c[0], this.f40786i));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f40771a.mo16454a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f40771a.mo16455b();
    }

    @Override // p000.mjw, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f40774l.m788k();
        m16464a(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        if (this.f40775m) {
            this.f40774l.m788k();
            m16464a(i / 10000.0f);
            return true;
        }
        this.f40774l.m785i(this.f40772b * 10000.0f);
        aiv aivVar = this.f40774l;
        float f = i;
        if (aivVar.f453m) {
            aivVar.f462r = f;
            return true;
        }
        if (aivVar.f461q == null) {
            aivVar.f461q = new aiw(f);
        }
        aivVar.f461q.m792d(f);
        aivVar.mo780d();
        return true;
    }
}
