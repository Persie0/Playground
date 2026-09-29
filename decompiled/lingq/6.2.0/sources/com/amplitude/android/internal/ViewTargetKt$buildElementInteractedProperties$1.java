package com.amplitude.android.internal;

import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class ViewTargetKt$buildElementInteractedProperties$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final ViewTargetKt$buildElementInteractedProperties$1 f10832b = new ViewTargetKt$buildElementInteractedProperties$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(str.charAt(0));
        strValueOf.getClass();
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        sb.append((Object) upperCase);
        sb.append(str.substring(1));
        return sb.toString();
    }
}
