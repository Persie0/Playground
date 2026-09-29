package com.lingq.commons.p053ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.activity.RunnableC0190i;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import p225kk.C6716m;
import p254m2.C7472a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13365d2 = {"Lcom/lingq/commons/ui/views/StreakRingView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakRingView extends View {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f16833g = 0;

    /* JADX INFO: renamed from: a */
    public final Paint f16834a;

    /* JADX INFO: renamed from: b */
    public final Paint f16835b;

    /* JADX INFO: renamed from: c */
    public final int f16836c;

    /* JADX INFO: renamed from: d */
    public final RectF f16837d;

    /* JADX INFO: renamed from: e */
    public final float f16838e;

    /* JADX INFO: renamed from: f */
    public final double f16839f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakRingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        this.f16836c = 270;
        List<Integer> list = C6716m.f37937a;
        this.f16838e = C6716m.m13316a(2);
        this.f16839f = 100.0d;
        int iM13333r = C6716m.m13333r(R.attr.greenTint, context);
        float fM13316a = C6716m.m13316a(2);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(fM13316a);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(iM13333r);
        paint.setAntiAlias(true);
        this.f16834a = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fM13316a / 2);
        paint2.setColor(-7829368);
        paint2.setAntiAlias(true);
        this.f16835b = paint2;
        this.f16837d = new RectF();
        post(new RunnableC0190i(19, this));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int iM14851a;
        C5207g.m11111f(canvas, "canvas");
        RectF rectF = this.f16837d;
        if (rectF != null && (paint = this.f16835b) != null) {
            canvas.drawArc(rectF, 0.0f, 360.0f, false, paint);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.FILL);
            double d10 = this.f16839f;
            if (0.0d >= ((double) 2) * d10) {
                Context context = getContext();
                Object obj = C7472a.f41322a;
                iM14851a = C7472a.d.m14851a(context, R.color.red_light);
            } else if (0.0d >= d10) {
                Context context2 = getContext();
                Object obj2 = C7472a.f41322a;
                iM14851a = C7472a.d.m14851a(context2, R.color.green_lighter);
            } else {
                Context context3 = getContext();
                Object obj3 = C7472a.f41322a;
                iM14851a = C7472a.d.m14851a(context3, R.color.grey_lighter);
            }
            paint2.setColor(iM14851a);
            paint2.setAlpha(90);
            paint2.setAntiAlias(true);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2) - this.f16838e, paint2);
        }
        if (rectF == null) {
            rectF = new RectF();
        }
        RectF rectF2 = rectF;
        float f3 = this.f16836c;
        float f10 = 0;
        Paint paint3 = this.f16834a;
        if (paint3 == null) {
            paint3 = new Paint();
        }
        canvas.drawArc(rectF2, f3, f10, false, paint3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        Paint paint = this.f16834a;
        float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
        float f3 = i10 / 2.0f;
        float f10 = i11;
        float f11 = f10 / 2.0f;
        if (i10 > i11) {
            i10 = i11;
        }
        float f12 = i10 / 2.0f;
        RectF rectF = this.f16837d;
        if (rectF != null) {
            rectF.left = (f3 - f12) + strokeWidth;
        }
        if (rectF != null) {
            rectF.top = (f10 - (f11 + f12)) + strokeWidth;
        }
        if (rectF != null) {
            rectF.right = (f3 + f12) - strokeWidth;
        }
        if (rectF == null) {
            return;
        }
        rectF.bottom = (f10 - (f11 - f12)) - strokeWidth;
    }
}
