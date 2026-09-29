package com.lingq.commons.p053ui.views;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import ni.C7793a;
import p225kk.C6716m;
import p254m2.C7472a;
import p312p2.C8169a;
import ph.C8326m4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m13365d2 = {"Lcom/lingq/commons/ui/views/StreakActivityLevelView;", "Landroid/widget/FrameLayout;", "", "getProgressIndicatorColor", "", "title", "Lsl/e;", "setTitle", "size", "setViewForSize", "Lph/m4;", "a", "Lph/m4;", "getBinding", "()Lph/m4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakActivityLevelView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f16812e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final C8326m4 binding;

    /* JADX INFO: renamed from: b */
    public int f16814b;

    /* JADX INFO: renamed from: c */
    public int f16815c;

    /* JADX INFO: renamed from: d */
    public int f16816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakActivityLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_streak_activity_level, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.cpStreak;
        StreakCircularProgressIndicator streakCircularProgressIndicator = (StreakCircularProgressIndicator) C0062b.m298P0(viewInflate, R.id.cpStreak);
        if (streakCircularProgressIndicator != null) {
            i10 = R.id.tvCoins;
            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvCoins);
            if (textView != null) {
                i10 = R.id.tvLabel;
                TextView textView2 = (TextView) C0062b.m298P0(viewInflate, R.id.tvLabel);
                if (textView2 != null) {
                    i10 = R.id.viewStreakFire;
                    StreakFireView streakFireView = (StreakFireView) C0062b.m298P0(viewInflate, R.id.viewStreakFire);
                    if (streakFireView != null) {
                        this.binding = new C8326m4(streakCircularProgressIndicator, textView, textView2, streakFireView);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    private final int getProgressIndicatorColor() {
        switch (this.f16816d) {
            case 1:
                Context context = getContext();
                C5207g.m11110e(context, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10474n(context))).intValue();
            case 2:
                Context context2 = getContext();
                C5207g.m11110e(context2, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10476o(context2))).intValue();
            case 3:
                Context context3 = getContext();
                C5207g.m11110e(context3, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10478p(context3))).intValue();
            case 4:
                Context context4 = getContext();
                C5207g.m11110e(context4, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10479q(context4))).intValue();
            case 5:
                Context context5 = getContext();
                C5207g.m11110e(context5, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10480r(context5))).intValue();
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context6 = getContext();
                C5207g.m11110e(context6, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10481s(context6))).intValue();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context7 = getContext();
                C5207g.m11110e(context7, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10482t(context7))).intValue();
            case 8:
                Context context8 = getContext();
                C5207g.m11110e(context8, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10483u(context8))).intValue();
            default:
                Context context9 = getContext();
                C5207g.m11110e(context9, "context");
                return ((Number) C6752c.m13423Q(C4924a.m10474n(context9))).intValue();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9375a(int i10, int i11, int i12, boolean z10) {
        String strM613i;
        this.f16816d = i12 < 1 ? 1 : i12;
        if (i11 > 0) {
            this.f16815c = i11;
            int i13 = i10 / i11;
        }
        if (i11 == -1) {
            this.f16815c = i10;
        }
        C8326m4 c8326m4 = this.binding;
        c8326m4.f45038a.setMaxProgress(this.f16815c);
        if (i11 == -1) {
            strM613i = C0141b.m613i(new Object[]{Integer.valueOf(i10)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)");
        } else {
            strM613i = C0141b.m613i(new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f16815c)}, 2, Locale.getDefault(), "%d/%d", "format(locale, format, *args)");
        }
        TextView textView = c8326m4.f45039b;
        textView.setText(strM613i);
        if (i11 == -1) {
            i11 = i10;
        }
        c8326m4.f45041d.m9379b(i10, i11, i12);
        int i14 = this.f16814b;
        StreakCircularProgressIndicator streakCircularProgressIndicator = c8326m4.f45038a;
        if (i10 != i14) {
            int iMax = Math.max(0, i10);
            this.f16814b = iMax;
            if (z10) {
                int i15 = this.f16815c;
                if (iMax > i15) {
                    iMax = i15;
                }
                streakCircularProgressIndicator.setProgressWithAnimation(iMax);
            } else {
                int i16 = this.f16815c;
                if (iMax > i16) {
                    iMax = i16;
                }
                streakCircularProgressIndicator.setProgress(iMax);
            }
        }
        Context context = getContext();
        Object obj = C7472a.f41322a;
        streakCircularProgressIndicator.setTrackColor(C7472a.d.m14851a(context, R.color.grey_light));
        int i17 = this.f16816d;
        TextView textView2 = c8326m4.f45040c;
        if (i17 == 7) {
            streakCircularProgressIndicator.setIsGoldGradient(false);
            textView.setTextColor(C7472a.d.m14851a(getContext(), R.color.indigo));
            textView2.setTextColor(C7472a.d.m14851a(getContext(), R.color.grey));
            return;
        }
        if (i17 == 8) {
            streakCircularProgressIndicator.setIsGoldGradient(true);
            List<Integer> list = C6716m.f37937a;
            Context context2 = getContext();
            C5207g.m11110e(context2, "context");
            textView.setTextColor(C6716m.m13333r(R.attr.backgroundGeneral, context2));
            Context context3 = getContext();
            C5207g.m11110e(context3, "context");
            textView2.setTextColor(C6716m.m13333r(R.attr.backgroundGeneral, context3));
            return;
        }
        streakCircularProgressIndicator.setIsGradient(false);
        List<Integer> list2 = C6716m.f37937a;
        Context context4 = getContext();
        C5207g.m11110e(context4, "context");
        textView2.setTextColor(C6716m.m13333r(R.attr.secondaryTextColor, context4));
        streakCircularProgressIndicator.setIndicatorColor(getProgressIndicatorColor());
        Context context5 = getContext();
        C5207g.m11110e(context5, "context");
        streakCircularProgressIndicator.setInnerCircleColor(C8169a.m16216h(getProgressIndicatorColor(), C7793a.m15499c(context5) ? 100 : 40));
    }

    public final C8326m4 getBinding() {
        return this.binding;
    }

    public final void setTitle(String str) {
        C5207g.m11111f(str, "title");
        this.binding.f45040c.setText(str);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void setViewForSize(int i10) {
        C8326m4 c8326m4 = this.binding;
        c8326m4.f45038a.setTrackThickness(6);
        StreakFireView streakFireView = c8326m4.f45041d;
        C5207g.m11110e(streakFireView, "viewStreakFire");
        int i11 = StreakFireView.f16829d;
        streakFireView.m9378a(i10, true);
        c8326m4.f45039b.setTextSize(2, 9.0f);
        TextView textView = c8326m4.f45040c;
        textView.setTextSize(2, 7.0f);
        C5207g.m11110e(textView, "tvLabel");
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        textView.setLayoutParams(marginLayoutParams);
    }
}
