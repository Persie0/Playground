package p483xe;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;
import ve.InterfaceC9715e;
import ve.InterfaceC9716f;

/* JADX INFO: renamed from: xe.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10183f implements InterfaceC9714d, InterfaceC9716f {

    /* JADX INFO: renamed from: a */
    public boolean f51508a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f51509b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, InterfaceC9713c<?>> f51510c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, InterfaceC9715e<?>> f51511d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9713c<Object> f51512e;

    /* JADX INFO: renamed from: f */
    public final boolean f51513f;

    public C10183f(Writer writer, HashMap map, HashMap map2, C10178a c10178a, boolean z10) {
        this.f51509b = new JsonWriter(writer);
        this.f51510c = map;
        this.f51511d = map2;
        this.f51512e = c10178a;
        this.f51513f = z10;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: a */
    public final InterfaceC9714d mo9175a(C9712b c9712b, long j10) throws IOException {
        String str = c9712b.f49721a;
        m19196i();
        JsonWriter jsonWriter = this.f51509b;
        jsonWriter.name(str);
        m19196i();
        jsonWriter.value(j10);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: b */
    public final InterfaceC9714d mo9176b(C9712b c9712b, int i10) throws IOException {
        String str = c9712b.f49721a;
        m19196i();
        JsonWriter jsonWriter = this.f51509b;
        jsonWriter.name(str);
        m19196i();
        jsonWriter.value(i10);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: c */
    public final InterfaceC9714d mo9177c(C9712b c9712b, boolean z10) throws IOException {
        String str = c9712b.f49721a;
        m19196i();
        JsonWriter jsonWriter = this.f51509b;
        jsonWriter.name(str);
        m19196i();
        jsonWriter.value(z10);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: d */
    public final InterfaceC9714d mo9178d(C9712b c9712b, Object obj) throws IOException {
        return m19195h(obj, c9712b.f49721a);
    }

    @Override // ve.InterfaceC9716f
    /* JADX INFO: renamed from: e */
    public final InterfaceC9716f mo18218e(String str) throws IOException {
        m19196i();
        this.f51509b.value(str);
        return this;
    }

    @Override // ve.InterfaceC9716f
    /* JADX INFO: renamed from: f */
    public final InterfaceC9716f mo18219f(boolean z10) throws IOException {
        m19196i();
        this.f51509b.value(z10);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final C10183f m19194g(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f51509b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m19194g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m19195h(entry.getValue(), (String) key);
                    } catch (ClassCastException e10) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC9713c<?> interfaceC9713c = this.f51510c.get(obj.getClass());
            if (interfaceC9713c != null) {
                jsonWriter.beginObject();
                interfaceC9713c.mo6757a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC9715e<?> interfaceC9715e = this.f51511d.get(obj.getClass());
            if (interfaceC9715e != null) {
                interfaceC9715e.mo6757a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                m19196i();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f51512e.mo6757a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            m19196i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                jsonWriter.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                long j10 = jArr[i10];
                m19196i();
                jsonWriter.value(j10);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                jsonWriter.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                jsonWriter.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i10 < length5) {
                m19194g(numberArr[i10]);
                i10++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i10 < length6) {
                m19194g(objArr[i10]);
                i10++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final C10183f m19195h(Object obj, String str) throws IOException {
        boolean z10 = this.f51513f;
        JsonWriter jsonWriter = this.f51509b;
        if (z10) {
            if (obj == null) {
                return this;
            }
            m19196i();
            jsonWriter.name(str);
            return m19194g(obj);
        }
        m19196i();
        jsonWriter.name(str);
        if (obj != null) {
            return m19194g(obj);
        }
        jsonWriter.nullValue();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final void m19196i() throws IOException {
        if (!this.f51508a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
