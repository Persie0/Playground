package com.iterable.iterableapi;

import kotlin.jvm.internal.Lambda;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
final class IterableMobileFrameworkDetector$hasClass$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final IterableMobileFrameworkDetector$hasClass$1 f13976b = new IterableMobileFrameworkDetector$hasClass$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean z;
        String str = (String) obj;
        str.getClass();
        try {
            Class.forName(str);
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
