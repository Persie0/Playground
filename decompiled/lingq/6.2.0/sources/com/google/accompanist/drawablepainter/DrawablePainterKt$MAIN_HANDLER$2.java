package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import p000.ui3;

/* JADX INFO: loaded from: classes2.dex */
final class DrawablePainterKt$MAIN_HANDLER$2 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public static final DrawablePainterKt$MAIN_HANDLER$2 f11531b = new DrawablePainterKt$MAIN_HANDLER$2(0);

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        return new Handler(Looper.getMainLooper());
    }
}
