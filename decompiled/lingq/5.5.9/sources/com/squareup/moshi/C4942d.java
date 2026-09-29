package com.squareup.moshi;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: renamed from: com.squareup.moshi.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4942d extends C4939a.b {
    public C4942d(Type type, Set set, Object obj, Method method, int i10) {
        super(type, set, obj, method, i10, 1, true);
    }

    @Override // com.squareup.moshi.C4939a.b
    /* JADX INFO: renamed from: b */
    public final Object mo10526b(JsonReader jsonReader) throws IOException, InvocationTargetException {
        return m10527c(jsonReader);
    }
}
