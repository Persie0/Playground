package p301oh;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.lingq.commons.p053ui.views.StreakCircularProgressIndicator;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C6752c;
import ni.C7793a;
import p024b3.C1299f;
import p254m2.C7472a;
import p312p2.C8169a;
import p385sf.C9000b;
import ph.C8308j4;

/* JADX INFO: renamed from: oh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8047f extends FrameLayout {

    /* JADX INFO: renamed from: H */
    public int f43715H;

    /* JADX INFO: renamed from: a */
    public final C8308j4 f43716a;

    /* JADX INFO: renamed from: b */
    public final List<Integer> f43717b;

    /* JADX INFO: renamed from: c */
    public final List<Integer> f43718c;

    /* JADX INFO: renamed from: d */
    public final List<Integer> f43719d;

    /* JADX INFO: renamed from: e */
    public final List<Integer> f43720e;

    /* JADX INFO: renamed from: f */
    public final List<Integer> f43721f;

    /* JADX INFO: renamed from: g */
    public final List<Integer> f43722g;

    /* JADX INFO: renamed from: h */
    public final List<Integer> f43723h;

    /* JADX INFO: renamed from: i */
    public final List<Integer> f43724i;

    /* JADX INFO: renamed from: j */
    public int f43725j;

    /* JADX INFO: renamed from: k */
    public int f43726k;

    /* JADX INFO: renamed from: l */
    public int f43727l;

    public C8047f(Context context) {
        super(context, null, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_mini_streak_activity_level, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.cpStreak;
        StreakCircularProgressIndicator streakCircularProgressIndicator = (StreakCircularProgressIndicator) C0062b.m298P0(viewInflate, R.id.cpStreak);
        if (streakCircularProgressIndicator != null) {
            i10 = R.id.guideline;
            if (C0062b.m298P0(viewInflate, R.id.guideline) != null) {
                i10 = R.id.ivCenterStreak;
                ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivCenterStreak);
                if (imageView != null) {
                    i10 = R.id.ivStreak;
                    ImageView imageView2 = (ImageView) C0062b.m298P0(viewInflate, R.id.ivStreak);
                    if (imageView2 != null) {
                        i10 = R.id.ivStreakBg;
                        if (((ImageView) C0062b.m298P0(viewInflate, R.id.ivStreakBg)) != null) {
                            i10 = R.id.tvStreak;
                            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvStreak);
                            if (textView != null) {
                                i10 = R.id.viewStreak;
                                if (((ConstraintLayout) C0062b.m298P0(viewInflate, R.id.viewStreak)) != null) {
                                    i10 = R.id.viewTopStreak;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C0062b.m298P0(viewInflate, R.id.viewTopStreak);
                                    if (constraintLayout != null) {
                                        this.f43716a = new C8308j4(streakCircularProgressIndicator, imageView, imageView2, textView, constraintLayout);
                                        Object obj = C7472a.f41322a;
                                        this.f43717b = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.green_activity_8)));
                                        this.f43718c = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.orange_activity_8)));
                                        this.f43719d = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.red_activity_8)));
                                        this.f43720e = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.purple_activity_8)));
                                        this.f43721f = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.pink_activity_8)));
                                        this.f43722g = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.blue_activity_8)));
                                        this.f43723h = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.silver_activity_8)));
                                        this.f43724i = C9000b.m17252r(Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_1)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_2)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_3)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_4)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_5)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_6)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_7)), Integer.valueOf(C7472a.d.m14851a(context, R.color.gold_activity_8)));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final int getFireImageColor() {
        int i10 = this.f43727l - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 7) {
            i10 = 7;
        }
        int i11 = this.f43715H;
        List<Integer> list = this.f43717b;
        switch (i11) {
            case 1:
                return list.get(i10).intValue();
            case 2:
                return this.f43718c.get(i10).intValue();
            case 3:
                return this.f43719d.get(i10).intValue();
            case 4:
                return this.f43720e.get(i10).intValue();
            case 5:
                return this.f43721f.get(i10).intValue();
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f43722g.get(i10).intValue();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f43723h.get(i10).intValue();
            case 8:
                return this.f43724i.get(i10).intValue();
            default:
                return list.get(i10).intValue();
        }
    }

    private final int getProgressIndicatorColor() {
        int i10 = this.f43715H;
        List<Integer> list = this.f43717b;
        switch (i10) {
            case 1:
                return ((Number) C6752c.m13423Q(list)).intValue();
            case 2:
                return ((Number) C6752c.m13423Q(this.f43718c)).intValue();
            case 3:
                return ((Number) C6752c.m13423Q(this.f43719d)).intValue();
            case 4:
                return ((Number) C6752c.m13423Q(this.f43720e)).intValue();
            case 5:
                return ((Number) C6752c.m13423Q(this.f43721f)).intValue();
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((Number) C6752c.m13423Q(this.f43722g)).intValue();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((Number) C6752c.m13423Q(this.f43723h)).intValue();
            case 8:
                return ((Number) C6752c.m13423Q(this.f43724i)).intValue();
            default:
                return ((Number) C6752c.m13423Q(list)).intValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15927a(int i10, int i11, int i12) {
        ColorStateList colorStateListValueOf;
        if (i12 < 1) {
            i12 = 1;
        }
        this.f43715H = i12;
        int iMax = Math.max(0, i10);
        if (i11 != 0) {
            this.f43726k = i11;
            this.f43727l = iMax / i11;
        }
        C8308j4 c8308j4 = this.f43716a;
        c8308j4.f44935a.setMaxProgress(this.f43726k);
        int i13 = this.f43727l;
        TextView textView = c8308j4.f44938d;
        if (i13 < 1) {
            Context context = getContext();
            Object obj = C7472a.f41322a;
            int iM14851a = C7472a.d.m14851a(context, R.color.grey_light);
            int progressIndicatorColor = getProgressIndicatorColor();
            float f3 = iMax / this.f43726k;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            colorStateListValueOf = ColorStateList.valueOf(C8169a.m16211c(f3, iM14851a, progressIndicatorColor));
        } else {
            textView.setTextColor(ColorStateList.valueOf(getProgressIndicatorColor()));
            colorStateListValueOf = ColorStateList.valueOf(getFireImageColor());
        }
        C5207g.m11110e(colorStateListValueOf, "if (streak < 1) {\n      …ageColor())\n            }");
        int i14 = this.f43725j;
        StreakCircularProgressIndicator streakCircularProgressIndicator = c8308j4.f44935a;
        if (iMax != i14) {
            this.f43725j = iMax;
            int i15 = this.f43726k;
            if (iMax > i15) {
                iMax = i15;
            }
            streakCircularProgressIndicator.setProgress(iMax);
        }
        Context context2 = getContext();
        Object obj2 = C7472a.f41322a;
        streakCircularProgressIndicator.setTrackColor(C7472a.d.m14851a(context2, R.color.grey_light));
        int i16 = this.f43727l;
        ConstraintLayout constraintLayout = c8308j4.f44939e;
        ImageView imageView = c8308j4.f44936b;
        if (i16 <= 1) {
            C5207g.m11110e(imageView, "ivCenterStreak");
            C4924a.m10457e0(imageView);
            C5207g.m11110e(constraintLayout, "viewTopStreak");
            C4924a.m10422A(constraintLayout);
            C5207g.m11110e(textView, "tvStreak");
            C4924a.m10442U(textView);
            C1299f.m4817c(imageView, colorStateListValueOf);
        } else {
            C5207g.m11110e(imageView, "ivCenterStreak");
            C4924a.m10442U(imageView);
            C5207g.m11110e(constraintLayout, "viewTopStreak");
            C4924a.m10457e0(constraintLayout);
            C5207g.m11110e(textView, "tvStreak");
            C4924a.m10457e0(textView);
            C1299f.m4817c(c8308j4.f44937c, colorStateListValueOf);
            String str = String.format("%dx", Arrays.copyOf(new Object[]{Integer.valueOf(this.f43727l)}, 1));
            C5207g.m11110e(str, "format(format, *args)");
            textView.setText(str);
        }
        int i17 = this.f43715H;
        if (i17 == 7) {
            streakCircularProgressIndicator.setIsGoldGradient(false);
            return;
        }
        if (i17 == 8) {
            streakCircularProgressIndicator.setIsGoldGradient(true);
            return;
        }
        streakCircularProgressIndicator.setIsGradient(false);
        streakCircularProgressIndicator.setIndicatorColor(getProgressIndicatorColor());
        Context context3 = getContext();
        C5207g.m11110e(context3, "context");
        streakCircularProgressIndicator.setInnerCircleColor(C8169a.m16216h(getProgressIndicatorColor(), C7793a.m15499c(context3) ? 100 : 40));
    }

    public final C8308j4 getBinding() {
        return this.f43716a;
    }

    public final void setViewForSize(int i10) {
        C8308j4 c8308j4 = this.f43716a;
        c8308j4.f44935a.setTrackThickness(2);
        double d10 = i10;
        int i11 = (int) (0.45d * d10);
        int i12 = (int) (d10 * 0.3d);
        if (this.f43727l <= 1) {
            ImageView imageView = c8308j4.f44936b;
            C5207g.m11110e(imageView, "ivCenterStreak");
            C4924a.m10443V(imageView, i12, i12);
        }
        ConstraintLayout constraintLayout = c8308j4.f44939e;
        C5207g.m11110e(constraintLayout, "viewTopStreak");
        C4924a.m10443V(constraintLayout, i11, i11);
        c8308j4.f44938d.setTextSize(2, 10.0f);
    }
}
