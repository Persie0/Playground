package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bke extends bkc {

    /* JADX INFO: renamed from: h */
    private final Paint f3592h;

    /* JADX INFO: renamed from: i */
    private final Rect f3593i;

    /* JADX INFO: renamed from: j */
    private final Rect f3594j;

    /* JADX INFO: renamed from: k */
    private bie f3595k;

    /* JADX INFO: renamed from: l */
    private bie f3596l;

    public bke(bgv bgvVar, bkf bkfVar) {
        super(bgvVar, bkfVar);
        this.f3592h = new bhg(3);
        this.f3593i = new Rect();
        this.f3594j = new Rect();
    }

    /* JADX INFO: renamed from: p */
    private final Bitmap m2542p() {
        bit bitVar;
        bie bieVar = this.f3596l;
        if (bieVar != null) {
            return (Bitmap) bieVar.mo2492e();
        }
        String str = this.f3568c.f3602f;
        bgv bgvVar = this.f3567b;
        if (bgvVar.getCallback() == null) {
            bitVar = null;
        } else {
            bit bitVar2 = bgvVar.f3210f;
            if (bitVar2 != null) {
                Drawable.Callback callback = bgvVar.getCallback();
                Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
                if ((context != null || bitVar2.f3445a != null) && !bitVar2.f3445a.equals(context)) {
                    bgvVar.f3210f = null;
                }
            }
            if (bgvVar.f3210f == null) {
                bgvVar.f3210f = new bit(bgvVar.getCallback(), bgvVar.f3211g, bgvVar.f3205a.f3173b);
            }
            bitVar = bgvVar.f3210f;
        }
        if (bitVar == null) {
            bgm bgmVar = bgvVar.f3205a;
            bgw bgwVar = bgmVar == null ? null : (bgw) bgmVar.f3173b.get(str);
            if (bgwVar == null) {
                return null;
            }
            return bgwVar.f3225e;
        }
        bgw bgwVar2 = (bgw) bitVar.f3447c.get(str);
        if (bgwVar2 == null) {
            return null;
        }
        Bitmap bitmap = bgwVar2.f3225e;
        if (bitmap != null) {
            return bitmap;
        }
        String str2 = bgwVar2.f3224d;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                bitVar.m2512a(str, bitmapDecodeByteArray);
                return bitmapDecodeByteArray;
            } catch (IllegalArgumentException e) {
                blx.m2681b("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(bitVar.f3446b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapM2703c = bme.m2703c(BitmapFactory.decodeStream(bitVar.f3445a.getAssets().open(bitVar.f3446b + str2), null, options), bgwVar2.f3221a, bgwVar2.f3222b);
                bitVar.m2512a(str, bitmapM2703c);
                return bitmapM2703c;
            } catch (IllegalArgumentException e2) {
                blx.m2681b("Unable to decode image.", e2);
                return null;
            }
        } catch (IOException e3) {
            blx.m2681b("Unable to open asset.", e3);
            return null;
        }
    }

    @Override // p000.bkc, p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        super.mo2464b(rectF, matrix, z);
        Bitmap bitmapM2542p = m2542p();
        if (bitmapM2542p != null) {
            rectF.set(0.0f, 0.0f, bitmapM2542p.getWidth() * bme.m2701a(), bitmapM2542p.getHeight() * bme.m2701a());
            this.f3566a.mapRect(rectF);
        }
    }

    @Override // p000.bkc, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3233E) {
            this.f3595k = new bis(bkoVar, null);
        } else if (obj == bha.f3236H) {
            this.f3596l = new bis(bkoVar, null);
        }
    }

    @Override // p000.bkc
    /* JADX INFO: renamed from: i */
    public final void mo2535i(Canvas canvas, Matrix matrix, int i) {
        Bitmap bitmapM2542p = m2542p();
        if (bitmapM2542p == null || bitmapM2542p.isRecycled()) {
            return;
        }
        float fM2701a = bme.m2701a();
        this.f3592h.setAlpha(i);
        bie bieVar = this.f3595k;
        if (bieVar != null) {
            this.f3592h.setColorFilter((ColorFilter) bieVar.mo2492e());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f3593i.set(0, 0, bitmapM2542p.getWidth(), bitmapM2542p.getHeight());
        this.f3594j.set(0, 0, (int) (bitmapM2542p.getWidth() * fM2701a), (int) (bitmapM2542p.getHeight() * fM2701a));
        canvas.drawBitmap(bitmapM2542p, this.f3593i, this.f3594j, this.f3592h);
        canvas.restore();
    }
}
