package com.squareup.moshi;

import androidx.activity.result.C0204c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p439vk.C9756b;
import tk.AbstractC9310n;
import tk.C9312p;

/* JADX INFO: renamed from: com.squareup.moshi.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C4939a implements AbstractC4949k.a {

    /* JADX INFO: renamed from: a */
    public final List<b> f32211a;

    /* JADX INFO: renamed from: b */
    public final List<b> f32212b;

    /* JADX INFO: renamed from: com.squareup.moshi.a$a */
    public class a extends AbstractC4949k<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f32213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC4949k f32214b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ b f32215c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Set f32216d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Type f32217e;

        public a(b bVar, AbstractC4949k abstractC4949k, C4955q c4955q, b bVar2, Set set, Type type) {
            this.f32213a = bVar;
            this.f32214b = abstractC4949k;
            this.f32215c = bVar2;
            this.f32216d = set;
            this.f32217e = type;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: a */
        public final Object mo9385a(JsonReader jsonReader) throws IOException {
            b bVar = this.f32215c;
            if (bVar == null) {
                return this.f32214b.mo9385a(jsonReader);
            }
            if (!bVar.f32224g && jsonReader.mo10505d0() == JsonReader.Token.NULL) {
                jsonReader.mo10501Q();
                return null;
            }
            try {
                return bVar.mo10526b(jsonReader);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + jsonReader.m10509r(), cause);
            }
        }

        @Override // com.squareup.moshi.AbstractC4949k
        /* JADX INFO: renamed from: f */
        public final void mo9386f(AbstractC9310n abstractC9310n, Object obj) throws IOException {
            b bVar = this.f32213a;
            if (bVar == null) {
                this.f32214b.mo9386f(abstractC9310n, obj);
                return;
            }
            if (!bVar.f32224g && obj == null) {
                abstractC9310n.mo10552E();
                return;
            }
            try {
                bVar.mo10528d(abstractC9310n, obj);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new JsonDataException(cause + " at " + abstractC9310n.m17655w(), cause);
            }
        }

        public final String toString() {
            return "JsonAdapter" + this.f32216d + "(" + this.f32217e + ")";
        }
    }

    /* JADX INFO: renamed from: com.squareup.moshi.a$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public final Type f32218a;

        /* JADX INFO: renamed from: b */
        public final Set<? extends Annotation> f32219b;

        /* JADX INFO: renamed from: c */
        public final Object f32220c;

        /* JADX INFO: renamed from: d */
        public final Method f32221d;

        /* JADX INFO: renamed from: e */
        public final int f32222e;

        /* JADX INFO: renamed from: f */
        public final AbstractC4949k<?>[] f32223f;

        /* JADX INFO: renamed from: g */
        public final boolean f32224g;

        public b(Type type, Set<? extends Annotation> set, Object obj, Method method, int i10, int i11, boolean z10) {
            this.f32218a = C9756b.m18242a(type);
            this.f32219b = set;
            this.f32220c = obj;
            this.f32221d = method;
            this.f32222e = i11;
            this.f32223f = new AbstractC4949k[i10 - i11];
            this.f32224g = z10;
        }

        /* JADX INFO: renamed from: a */
        public void mo10525a(C4955q c4955q, AbstractC4949k.a aVar) {
            AbstractC4949k<?>[] abstractC4949kArr = this.f32223f;
            if (abstractC4949kArr.length > 0) {
                Method method = this.f32221d;
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                int length = genericParameterTypes.length;
                int i10 = this.f32222e;
                for (int i11 = i10; i11 < length; i11++) {
                    Type type = ((ParameterizedType) genericParameterTypes[i11]).getActualTypeArguments()[0];
                    Set<? extends Annotation> setM18247f = C9756b.m18247f(parameterAnnotations[i11]);
                    abstractC4949kArr[i11 - i10] = (C9312p.m17657b(this.f32218a, type) && this.f32219b.equals(setM18247f)) ? c4955q.m10566d(aVar, type, setM18247f) : c4955q.m10565c(type, setM18247f, null);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public Object mo10526b(JsonReader jsonReader) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }

        /* JADX INFO: renamed from: c */
        public final Object m10527c(Object obj) throws InvocationTargetException {
            AbstractC4949k<?>[] abstractC4949kArr = this.f32223f;
            Object[] objArr = new Object[abstractC4949kArr.length + 1];
            objArr[0] = obj;
            System.arraycopy(abstractC4949kArr, 0, objArr, 1, abstractC4949kArr.length);
            try {
                return this.f32221d.invoke(this.f32220c, objArr);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: d */
        public void mo10528d(AbstractC9310n abstractC9310n, Object obj) throws IOException, InvocationTargetException {
            throw new AssertionError();
        }
    }

    public C4939a(ArrayList arrayList, ArrayList arrayList2) {
        this.f32211a = arrayList;
        this.f32212b = arrayList2;
    }

    /* JADX INFO: renamed from: b */
    public static b m10523b(List<b> list, Type type, Set<? extends Annotation> set) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = list.get(i10);
            if (C9312p.m17657b(bVar.f32218a, type) && bVar.f32219b.equals(set)) {
                return bVar;
            }
        }
        return null;
    }

    @Override // com.squareup.moshi.AbstractC4949k.a
    /* JADX INFO: renamed from: a */
    public final AbstractC4949k<?> mo10524a(Type type, Set<? extends Annotation> set, C4955q c4955q) {
        b bVarM10523b = m10523b(this.f32211a, type, set);
        b bVarM10523b2 = m10523b(this.f32212b, type, set);
        AbstractC4949k abstractC4949kM10566d = null;
        if (bVarM10523b == null && bVarM10523b2 == null) {
            return null;
        }
        if (bVarM10523b == null || bVarM10523b2 == null) {
            try {
                abstractC4949kM10566d = c4955q.m10566d(this, type, set);
            } catch (IllegalArgumentException e10) {
                StringBuilder sbM854m = C0204c.m854m("No ", bVarM10523b == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbM854m.append(C9756b.m18252k(type, set));
                throw new IllegalArgumentException(sbM854m.toString(), e10);
            }
        }
        AbstractC4949k abstractC4949k = abstractC4949kM10566d;
        if (bVarM10523b != null) {
            bVarM10523b.mo10525a(c4955q, this);
        }
        if (bVarM10523b2 != null) {
            bVarM10523b2.mo10525a(c4955q, this);
        }
        return new a(bVarM10523b, abstractC4949k, c4955q, bVarM10523b2, set, type);
    }
}
