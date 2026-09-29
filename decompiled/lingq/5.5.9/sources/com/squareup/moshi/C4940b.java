package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: com.squareup.moshi.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4940b extends C4939a.b {
    public C4940b(Type type, Set set, Object obj, Method method, int i10) {
        super(type, set, obj, method, i10, 2, true);
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: d */
    public final void mo10528d(AbstractC9310n abstractC9310n, Object obj) throws IOException, InvocationTargetException {
        AbstractC4949k<?>[] abstractC4949kArr = this.f32223f;
        Object[] objArr = new Object[abstractC4949kArr.length + 2];
        objArr[0] = abstractC9310n;
        objArr[1] = obj;
        System.arraycopy(abstractC4949kArr, 0, objArr, 2, abstractC4949kArr.length);
        try {
            this.f32221d.invoke(this.f32220c, objArr);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }
}
