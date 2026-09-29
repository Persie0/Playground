package p000;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pg4 implements gp6, zna {

    /* JADX INFO: renamed from: a */
    public final boolean f56125a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f56126b;

    /* JADX INFO: renamed from: c */
    public final Map f56127c;

    /* JADX INFO: renamed from: d */
    public final Map f56128d;

    /* JADX INFO: renamed from: e */
    public final fp6 f56129e;

    /* JADX INFO: renamed from: f */
    public final boolean f56130f;

    public pg4(Writer writer, Map map, Map map2, fp6 fp6Var, boolean z) {
        this.f56126b = new JsonWriter(writer);
        this.f56127c = map;
        this.f56128d = map2;
        this.f56129e = fp6Var;
        this.f56130f = z;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: a */
    public final gp6 mo12789a(c33 c33Var, Object obj) throws IOException {
        m19127i(obj, c33Var.f9387a);
        return this;
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: b */
    public final zna mo16390b(String str) throws IOException {
        m19128j();
        this.f56126b.value(str);
        return this;
    }

    @Override // p000.zna
    /* JADX INFO: renamed from: c */
    public final zna mo16391c(boolean z) throws IOException {
        m19128j();
        this.f56126b.value(z);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: d */
    public final gp6 mo12790d(c33 c33Var, boolean z) throws IOException {
        String str = c33Var.f9387a;
        m19128j();
        JsonWriter jsonWriter = this.f56126b;
        jsonWriter.name(str);
        m19128j();
        jsonWriter.value(z);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: e */
    public final gp6 mo12791e(c33 c33Var, int i) throws IOException {
        String str = c33Var.f9387a;
        m19128j();
        JsonWriter jsonWriter = this.f56126b;
        jsonWriter.name(str);
        m19128j();
        jsonWriter.value(i);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: f */
    public final gp6 mo12792f(c33 c33Var, double d) throws IOException {
        String str = c33Var.f9387a;
        m19128j();
        JsonWriter jsonWriter = this.f56126b;
        jsonWriter.name(str);
        m19128j();
        jsonWriter.value(d);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: g */
    public final gp6 mo12793g(c33 c33Var, long j) throws IOException {
        String str = c33Var.f9387a;
        m19128j();
        JsonWriter jsonWriter = this.f56126b;
        jsonWriter.name(str);
        m19128j();
        jsonWriter.value(j);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final pg4 m19126h(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f56126b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m19126h(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m19127i(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            fp6 fp6Var = (fp6) this.f56127c.get(obj.getClass());
            if (fp6Var != null) {
                jsonWriter.beginObject();
                fp6Var.mo24a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            yna ynaVar = (yna) this.f56128d.get(obj.getClass());
            if (ynaVar != null) {
                ynaVar.mo24a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f56129e.mo24a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            if (obj instanceof cp6) {
                int number = ((cp6) obj).getNumber();
                m19128j();
                jsonWriter.value(number);
                return this;
            }
            String strName = ((Enum) obj).name();
            m19128j();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m19128j();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                m19128j();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                m19126h(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                m19126h(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final pg4 m19127i(Object obj, String str) throws IOException {
        boolean z = this.f56130f;
        JsonWriter jsonWriter = this.f56126b;
        if (z) {
            if (obj == null) {
                return this;
            }
            m19128j();
            jsonWriter.name(str);
            m19126h(obj);
            return this;
        }
        m19128j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m19126h(obj);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final void m19128j() {
        if (this.f56125a) {
            return;
        }
        C3386nv.m17633t("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
