package p000;

import java.util.Map;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2911d1 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34816a;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f34816a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (atb.m3037a(getKey(), entry.getKey()) && atb.m3037a(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (ts3.m22281b(getKey(), entry2.getKey()) && ts3.m22281b(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f34816a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.f34816a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return AbstractC3393o1.m17735j(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
