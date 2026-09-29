package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class sp5 implements Map.Entry, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61203a;

    /* JADX INFO: renamed from: b */
    public final Object f61204b;

    /* JADX INFO: renamed from: c */
    public final Object f61205c;

    public /* synthetic */ sp5(int i, Object obj, Object obj2) {
        this.f61203a = i;
        this.f61204b = obj;
        this.f61205c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f61203a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && fa4.m11650l(entry.getKey(), this.f61204b) && fa4.m11650l(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f61203a) {
            case 0:
                break;
        }
        return this.f61204b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f61203a) {
            case 0:
                break;
        }
        return this.f61205c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f61203a) {
            case 0:
                Object obj = this.f61204b;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f61203a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f61203a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f61204b);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
