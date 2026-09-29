package p240ld;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import gd.C5768g;
import gd.C5772k;

/* JADX INFO: renamed from: ld.f */
/* JADX INFO: loaded from: classes.dex */
public class C7306f extends C5768g {

    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ int f40927T = 0;

    /* JADX INFO: renamed from: S */
    public a f40928S;

    /* JADX INFO: renamed from: ld.f$a */
    public static final class a extends C5768g.b {

        /* JADX INFO: renamed from: v */
        public final RectF f40929v;

        public a(C5772k c5772k, RectF rectF) {
            super(c5772k);
            this.f40929v = rectF;
        }

        public a(a aVar) {
            super(aVar);
            this.f40929v = aVar.f40929v;
        }

        @Override // gd.C5768g.b, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.invalidateSelf();
            return bVar;
        }
    }

    /* JADX INFO: renamed from: ld.f$b */
    @TargetApi(18)
    public static class b extends C7306f {
        public b(a aVar) {
            super(aVar);
        }

        @Override // gd.C5768g
        /* JADX INFO: renamed from: g */
        public final void mo12135g(Canvas canvas) {
            if (this.f40928S.f40929v.isEmpty()) {
                super.mo12135g(canvas);
                return;
            }
            canvas.save();
            canvas.clipOutRect(this.f40928S.f40929v);
            super.mo12135g(canvas);
            canvas.restore();
        }
    }

    public C7306f(a aVar) {
        super(aVar);
        this.f40928S = aVar;
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f40928S = new a(this.f40928S);
        return this;
    }

    /* JADX INFO: renamed from: u */
    public final void m14705u(float f3, float f10, float f11, float f12) {
        RectF rectF = this.f40928S.f40929v;
        if (f3 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f3, f10, f11, f12);
        invalidateSelf();
    }
}
