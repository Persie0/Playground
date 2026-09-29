package com.lingq.commons.p053ui.views;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import p024b3.C1299f;
import p225kk.C6716m;
import p254m2.C7472a;
import p312p2.C8169a;
import ph.C8332n4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, m13365d2 = {"Lcom/lingq/commons/ui/views/StreakFireView;", "Landroid/widget/RelativeLayout;", "", "getFireImage", "getFireImageColor", "getProgressIndicatorColor", "Lph/n4;", "c", "Lph/n4;", "getBinding", "()Lph/n4;", "binding", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class StreakFireView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f16829d = 0;

    /* JADX INFO: renamed from: a */
    public int f16830a;

    /* JADX INFO: renamed from: b */
    public int f16831b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C8332n4 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public StreakFireView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C5207g.m11111f(context, "context");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_streak_flame, (ViewGroup) this, false);
        addView(viewInflate);
        int i10 = R.id.ivStreak;
        ImageView imageView = (ImageView) C0062b.m298P0(viewInflate, R.id.ivStreak);
        if (imageView != null) {
            i10 = R.id.tvStreak;
            TextView textView = (TextView) C0062b.m298P0(viewInflate, R.id.tvStreak);
            if (textView != null) {
                i10 = R.id.viewStreak;
                RelativeLayout relativeLayout = (RelativeLayout) C0062b.m298P0(viewInflate, R.id.viewStreak);
                if (relativeLayout != null) {
                    this.binding = new C8332n4(imageView, textView, relativeLayout);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    private final int getFireImage() {
        switch (this.f16830a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
            case 1:
            case 2:
            case 3:
                return R.drawable.ic_fire_no_star;
            case 4:
            case 5:
                return R.drawable.ic_fire_one_star;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return R.drawable.ic_fire_two_star;
            default:
                return R.drawable.ic_fire_three_star;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final int getFireImageColor() {
        int i10 = this.f16830a - 1;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 7) {
            i10 = 7;
        }
        switch (this.f16831b) {
            case 1:
                Context context = getContext();
                C5207g.m11110e(context, "context");
                return C4924a.m10474n(context).get(i10).intValue();
            case 2:
                Context context2 = getContext();
                C5207g.m11110e(context2, "context");
                return C4924a.m10476o(context2).get(i10).intValue();
            case 3:
                Context context3 = getContext();
                C5207g.m11110e(context3, "context");
                return C4924a.m10478p(context3).get(i10).intValue();
            case 4:
                Context context4 = getContext();
                C5207g.m11110e(context4, "context");
                return C4924a.m10479q(context4).get(i10).intValue();
            case 5:
                Context context5 = getContext();
                C5207g.m11110e(context5, "context");
                return C4924a.m10480r(context5).get(i10).intValue();
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                Context context6 = getContext();
                C5207g.m11110e(context6, "context");
                return C4924a.m10481s(context6).get(i10).intValue();
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                Context context7 = getContext();
                C5207g.m11110e(context7, "context");
                return C4924a.m10482t(context7).get(i10).intValue();
            case 8:
                Context context8 = getContext();
                C5207g.m11110e(context8, "context");
                return C4924a.m10483u(context8).get(i10).intValue();
            default:
                Context context9 = getContext();
                C5207g.m11110e(context9, "context");
                return C4924a.m10474n(context9).get(i10).intValue();
        }
    }

    private final int getProgressIndicatorColor() {
        switch (this.f16831b) {
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
    public final void m9378a(int i10, boolean z10) {
        int i11 = z10 ? (int) (((double) (i10 / Resources.getSystem().getDisplayMetrics().density)) * 0.32d) : (int) (i10 / Resources.getSystem().getDisplayMetrics().density);
        double d10 = i11;
        int i12 = (int) (0.55d * d10);
        C8332n4 c8332n4 = this.binding;
        ImageView imageView = c8332n4.f45091a;
        C5207g.m11110e(imageView, "ivStreak");
        List<Integer> list = C6716m.f37937a;
        C4924a.m10443V(imageView, (int) C6716m.m13316a(i11), (int) C6716m.m13316a(i11));
        RelativeLayout relativeLayout = c8332n4.f45093c;
        C5207g.m11110e(relativeLayout, "viewStreak");
        C4924a.m10443V(relativeLayout, (int) C6716m.m13316a(i12), (int) C6716m.m13316a(i12));
        c8332n4.f45092b.setTextSize(2, 5.0f);
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(0, (int) C6716m.m13316a((int) (d10 * 0.5d)), 0, 0);
        relativeLayout.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: b */
    public final void m9379b(int i10, int i11, int i12) {
        int i13 = 0;
        int iMax = Math.max(0, i10);
        boolean z10 = true;
        if (i12 < 1) {
            i12 = 1;
        }
        this.f16831b = i12;
        if (i11 != 0) {
            this.f16830a = iMax / i11;
        }
        C8332n4 c8332n4 = this.binding;
        TextView textView = c8332n4.f45092b;
        String str = String.format("%dx", Arrays.copyOf(new Object[]{Integer.valueOf(this.f16830a)}, 1));
        C5207g.m11110e(str, "format(format, *args)");
        textView.setText(str);
        ImageView imageView = c8332n4.f45091a;
        Context context = getContext();
        int fireImage = getFireImage();
        Object obj = C7472a.f41322a;
        imageView.setImageDrawable(C7472a.c.m14849b(context, fireImage));
        int i14 = this.f16830a;
        ImageView imageView2 = c8332n4.f45091a;
        if (i14 < 1) {
            int iM14851a = C7472a.d.m14851a(getContext(), R.color.grey_light);
            int progressIndicatorColor = getProgressIndicatorColor();
            float f3 = iMax / i11;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            C1299f.m4817c(imageView2, ColorStateList.valueOf(C8169a.m16211c(f3, iM14851a, progressIndicatorColor)));
        } else {
            C1299f.m4817c(imageView2, ColorStateList.valueOf(getFireImageColor()));
        }
        RelativeLayout relativeLayout = c8332n4.f45093c;
        C5207g.m11110e(relativeLayout, "viewStreak");
        if (this.f16830a <= 1) {
            z10 = false;
        }
        if (!Boolean.valueOf(z10).booleanValue()) {
            i13 = 4;
        }
        relativeLayout.setVisibility(i13);
    }

    public final C8332n4 getBinding() {
        return this.binding;
    }
}
