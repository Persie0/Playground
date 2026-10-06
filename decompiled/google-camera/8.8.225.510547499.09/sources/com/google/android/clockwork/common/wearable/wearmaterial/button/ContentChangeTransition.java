package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.text.Spanned;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Map;
import p000.ake;
import p000.akg;
import p000.iwa;
import p000.iwd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ContentChangeTransition extends TransitionSet {

    /* JADX INFO: renamed from: a */
    public static final String[] f7420a;

    /* JADX INFO: renamed from: b */
    private static final Interpolator f7421b = new akg();

    /* JADX INFO: renamed from: c */
    private static final Interpolator f7422c = new ake();

    /* JADX INFO: renamed from: d */
    private static final String f7423d;

    /* JADX INFO: renamed from: e */
    private static final String f7424e;

    /* JADX INFO: renamed from: f */
    private static final String f7425f;

    static {
        String name = ContentChangeTransition.class.getName();
        f7423d = name;
        String strConcat = String.valueOf(name).concat(":content-version");
        f7424e = strConcat;
        String strConcat2 = String.valueOf(name).concat(":visibility");
        f7425f = strConcat2;
        f7420a = new String[]{strConcat2, strConcat};
    }

    public ContentChangeTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrdering(1);
        iwd iwdVar = new iwd();
        iwdVar.setDuration(150L);
        iwdVar.setInterpolator(f7422c);
        addTransition(iwdVar);
        iwa iwaVar = new iwa();
        iwaVar.setDuration(300L);
        iwaVar.setInterpolator(f7421b);
        addTransition(iwaVar);
    }

    /* JADX INFO: renamed from: a */
    static int m4579a(Map map) {
        Integer num = (Integer) map.get(f7424e);
        return num == null ? View.generateViewId() : num.intValue();
    }

    /* JADX INFO: renamed from: b */
    public static void m4580b(TransitionValues transitionValues) {
        View view = transitionValues.view;
        Integer num = (Integer) view.getTag(C0100R.id.tag_content_version);
        transitionValues.values.put(f7424e, Integer.valueOf(num == null ? View.generateViewId() : num.intValue()));
        transitionValues.values.put(f7425f, Boolean.valueOf(view.getVisibility() == 0));
    }

    /* JADX INFO: renamed from: c */
    static void m4581c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (text == charSequence) {
            return;
        }
        if (text == null || charSequence == null || (text instanceof Spanned) || (charSequence instanceof Spanned) || !text.toString().contentEquals(charSequence)) {
            textView.setText(charSequence);
            textView.setTag(C0100R.id.tag_content_version, Integer.valueOf(View.generateViewId()));
        }
    }

    /* JADX INFO: renamed from: d */
    static boolean m4582d(Map map) {
        Boolean bool = (Boolean) map.get(f7425f);
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4583e(TransitionValues transitionValues, TransitionValues transitionValues2) {
        Map map = transitionValues.values;
        Map map2 = transitionValues2.values;
        if (transitionValues.view != transitionValues2.view) {
            return false;
        }
        return m4582d(map) && m4582d(map2) && m4579a(map) != m4579a(map2);
    }
}
