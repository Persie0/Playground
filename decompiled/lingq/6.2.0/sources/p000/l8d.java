package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l8d {
    /* JADX INFO: renamed from: a */
    public static final void m16027a(e16 e16Var, s65 s65Var, qj9 qj9Var, uj9 uj9Var, ui3 ui3Var, ye1 ye1Var, int i) {
        s65Var.getClass();
        qj9Var.getClass();
        uj9Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1172935135);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22124i(s65Var) ? 32 : 16) | (tj3Var.m22124i(qj9Var) ? 256 : 128) | (tj3Var.m22124i(uj9Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            qid.m19982b(null, ci8.m4703P(1690709046, new C2919d9(s65Var, qj9Var, uj9Var, ui3Var, 5), tj3Var), tj3Var, 48, 1);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(e16Var, s65Var, qj9Var, uj9Var, ui3Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00d3  */
    /* JADX INFO: renamed from: b */
    public static ImageView m16028b(ViewGroup viewGroup, View view, View view2) {
        int iIndexOfChild;
        ViewGroup viewGroup2;
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        r90 r90Var = awa.f7627a;
        view.transformMatrixToGlobal(matrix);
        viewGroup.transformMatrixToLocal(matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int iRound = Math.round(rectF.left);
        int iRound2 = Math.round(rectF.top);
        int iRound3 = Math.round(rectF.right);
        int iRound4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        boolean zIsAttachedToWindow = view.isAttachedToWindow();
        boolean zIsAttachedToWindow2 = viewGroup.isAttachedToWindow();
        Bitmap bitmapM21921a = null;
        if (!zIsAttachedToWindow) {
            if (zIsAttachedToWindow2) {
                viewGroup2 = (ViewGroup) view.getParent();
                iIndexOfChild = viewGroup2.indexOfChild(view);
                viewGroup.getOverlay().add(view);
            }
            if (bitmapM21921a != null) {
                imageView.setImageBitmap(bitmapM21921a);
            }
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
            imageView.layout(iRound, iRound2, iRound3, iRound4);
            return imageView;
        }
        iIndexOfChild = 0;
        viewGroup2 = null;
        int iRound5 = Math.round(rectF.width());
        int iRound6 = Math.round(rectF.height());
        if (iRound5 > 0 && iRound6 > 0) {
            float fMin = Math.min(1.0f, 1048576.0f / (iRound5 * iRound6));
            int iRound7 = Math.round(iRound5 * fMin);
            int iRound8 = Math.round(iRound6 * fMin);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            Picture picture = new Picture();
            Canvas canvasBeginRecording = picture.beginRecording(iRound7, iRound8);
            canvasBeginRecording.concat(matrix);
            view.draw(canvasBeginRecording);
            picture.endRecording();
            bitmapM21921a = taa.m21921a(picture);
        }
        if (!zIsAttachedToWindow) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, iIndexOfChild);
        }
        if (bitmapM21921a != null) {
            imageView.setImageBitmap(bitmapM21921a);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(iRound3 - iRound, 1073741824), View.MeasureSpec.makeMeasureSpec(iRound4 - iRound2, 1073741824));
        imageView.layout(iRound, iRound2, iRound3, iRound4);
        return imageView;
    }

    /* JADX INFO: renamed from: c */
    public static Animator m16029c(ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2) {
        if (objectAnimator == null) {
            return objectAnimator2;
        }
        if (objectAnimator2 == null) {
            return objectAnimator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimator, objectAnimator2);
        return animatorSet;
    }
}
