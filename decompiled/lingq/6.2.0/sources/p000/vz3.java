package p000;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.utils.OffscreenLayer$RenderStrategy;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class vz3 extends o90 {

    /* JADX INFO: renamed from: C */
    public final yk4 f66127C;

    /* JADX INFO: renamed from: D */
    public final Rect f66128D;

    /* JADX INFO: renamed from: E */
    public final Rect f66129E;

    /* JADX INFO: renamed from: F */
    public final RectF f66130F;

    /* JADX INFO: renamed from: G */
    public final wl5 f66131G;

    /* JADX INFO: renamed from: H */
    public wna f66132H;

    /* JADX INFO: renamed from: I */
    public wna f66133I;

    /* JADX INFO: renamed from: J */
    public final tm2 f66134J;

    /* JADX INFO: renamed from: K */
    public fq6 f66135K;

    /* JADX INFO: renamed from: L */
    public ztb f66136L;

    public vz3(C0868b c0868b, tp4 tp4Var) {
        super(c0868b, tp4Var);
        this.f66127C = new yk4(3, 0);
        this.f66128D = new Rect();
        this.f66129E = new Rect();
        this.f66130F = new RectF();
        String str = tp4Var.f62677g;
        gl5 gl5Var = c0868b.f10620a;
        this.f66131G = gl5Var == null ? null : (wl5) ((HashMap) gl5Var.m12732f()).get(str);
        ca1 ca1Var = this.f54060p.f62694x;
        if (ca1Var != null) {
            this.f66134J = new tm2(this, this, ca1Var);
        }
    }

    @Override // p000.o90, p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        Bitmap bitmapM23658r;
        super.mo555d(rectF, matrix, z);
        wl5 wl5Var = this.f66131G;
        if (wl5Var != null) {
            int i = wl5Var.f67008b;
            int i2 = wl5Var.f67007a;
            float fM11957c = fna.m11957c();
            if (this.f54059o.f10602I || (bitmapM23658r = m23658r()) == null) {
                rectF.set(0.0f, 0.0f, i2 * fM11957c, i * fM11957c);
            } else {
                rectF.set(0.0f, 0.0f, bitmapM23658r.getWidth() * fM11957c, bitmapM23658r.getHeight() * fM11957c);
            }
            this.f54058n.mapRect(rectF);
        }
    }

    @Override // p000.o90, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        if (obj == yl5.f69999I) {
            this.f66132H = new wna(p33Var, null);
            return;
        }
        if (obj == yl5.f70002L) {
            this.f66133I = new wna(p33Var, null);
            return;
        }
        tm2 tm2Var = this.f66134J;
        if (obj == 5 && tm2Var != null) {
            tm2Var.f62519c.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f69995E && tm2Var != null) {
            tm2Var.m22232c(p33Var);
            return;
        }
        if (obj == yl5.f69996F && tm2Var != null) {
            tm2Var.f62521e.m16695k(p33Var);
            return;
        }
        if (obj == yl5.f69997G && tm2Var != null) {
            tm2Var.f62522f.m16695k(p33Var);
        } else {
            if (obj != yl5.f69998H || tm2Var == null) {
                return;
            }
            tm2Var.f62523g.m16695k(p33Var);
        }
    }

    @Override // p000.o90
    /* JADX INFO: renamed from: j */
    public final void mo10091j(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        wl5 wl5Var;
        Bitmap bitmapM23658r = m23658r();
        if (bitmapM23658r == null || bitmapM23658r.isRecycled() || (wl5Var = this.f66131G) == null) {
            return;
        }
        float fM11957c = fna.m11957c();
        yk4 yk4Var = this.f66127C;
        yk4Var.setAlpha(i);
        wna wnaVar = this.f66132H;
        if (wnaVar != null) {
            yk4Var.setColorFilter((ColorFilter) wnaVar.mo16692f());
        }
        tm2 tm2Var = this.f66134J;
        if (tm2Var != null) {
            qm2Var = tm2Var.m22231b(matrix, i);
        }
        int width = bitmapM23658r.getWidth();
        int height = bitmapM23658r.getHeight();
        Rect rect = this.f66128D;
        rect.set(0, 0, width, height);
        boolean z = this.f54059o.f10602I;
        Rect rect2 = this.f66129E;
        if (z) {
            rect2.set(0, 0, (int) (wl5Var.f67007a * fM11957c), (int) (wl5Var.f67008b * fM11957c));
        } else {
            rect2.set(0, 0, (int) (bitmapM23658r.getWidth() * fM11957c), (int) (bitmapM23658r.getHeight() * fM11957c));
        }
        boolean z2 = qm2Var != null;
        if (z2) {
            if (this.f66135K == null) {
                this.f66135K = new fq6();
            }
            if (this.f66136L == null) {
                this.f66136L = new ztb(7, (byte) 0);
            }
            ztb ztbVar = this.f66136L;
            ztbVar.f72161b = 255;
            ztbVar.f72162c = null;
            qm2Var.getClass();
            qm2 qm2Var2 = new qm2(qm2Var);
            ztbVar.f72162c = qm2Var2;
            qm2Var2.m20024b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.f66130F;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.f66135K.m11998e(canvas, rectF, this.f66136L);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapM23658r, rect, rect2, yk4Var);
        if (z2) {
            this.f66135K.m11997c();
            if (this.f66135K.f39461c == OffscreenLayer$RenderStrategy.RENDER_NODE) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX INFO: renamed from: r */
    public final Bitmap m23658r() {
        Bitmap bitmapM11959e;
        Bitmap bitmap;
        wna wnaVar = this.f66133I;
        if (wnaVar != null && (bitmap = (Bitmap) wnaVar.mo16692f()) != null) {
            return bitmap;
        }
        String str = this.f54060p.f62677g;
        C0868b c0868b = this.f54059o;
        gv5 gv5Var = c0868b.f10634h;
        if (gv5Var != null) {
            Context contextM5005j = c0868b.m5005j();
            Context context = (Context) gv5Var.f41392b;
            if (contextM5005j != null) {
                if (context instanceof Application) {
                    contextM5005j = contextM5005j.getApplicationContext();
                }
                if (contextM5005j != context) {
                    c0868b.f10634h = null;
                }
            } else if (context != null) {
                c0868b.f10634h = null;
            }
        }
        if (c0868b.f10634h == null) {
            c0868b.f10634h = new gv5(c0868b.getCallback(), c0868b.f10636i, c0868b.f10620a.m12732f());
        }
        gv5 gv5Var2 = c0868b.f10634h;
        if (gv5Var2 != null) {
            String str2 = (String) gv5Var2.f41393c;
            wl5 wl5Var = (wl5) ((Map) gv5Var2.f41394d).get(str);
            if (wl5Var == null) {
                bitmapM11959e = null;
            } else {
                int i = wl5Var.f67008b;
                int i2 = wl5Var.f67007a;
                bitmapM11959e = wl5Var.f67012f;
                if (bitmapM11959e == null) {
                    Context context2 = (Context) gv5Var2.f41392b;
                    if (context2 == null) {
                        bitmapM11959e = null;
                    } else {
                        String str3 = wl5Var.f67010d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        tj5.m22151c("Decoded image `" + str + "` is null.");
                                        bitmapM11959e = null;
                                    } else {
                                        bitmapM11959e = fna.m11959e(bitmapDecodeStream, i2, i);
                                        synchronized (gv5.f41387f) {
                                            ((wl5) ((Map) gv5Var2.f41394d).get(str)).f67012f = bitmapM11959e;
                                        }
                                    }
                                } catch (IllegalArgumentException e) {
                                    tj5.m22152d("Unable to decode image `" + str + "`.", e);
                                }
                            } catch (IOException e2) {
                                tj5.m22152d("Unable to open asset.", e2);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                    if (bitmapDecodeByteArray == null) {
                                        tj5.m22151c("Decoded image `" + str + "` is null.");
                                        bitmapM11959e = null;
                                    } else {
                                        bitmapM11959e = fna.m11959e(bitmapDecodeByteArray, i2, i);
                                        synchronized (gv5.f41387f) {
                                            ((wl5) ((Map) gv5Var2.f41394d).get(str)).f67012f = bitmapM11959e;
                                        }
                                    }
                                } catch (IllegalArgumentException e3) {
                                    tj5.m22152d("Unable to decode image `" + str + "`.", e3);
                                }
                            } catch (IllegalArgumentException e4) {
                                tj5.m22152d("data URL did not have correct base64 format.", e4);
                            }
                        }
                    }
                }
            }
        } else {
            bitmapM11959e = null;
        }
        if (bitmapM11959e != null) {
            return bitmapM11959e;
        }
        wl5 wl5Var2 = this.f66131G;
        if (wl5Var2 != null) {
            return wl5Var2.f67012f;
        }
        return null;
    }
}
