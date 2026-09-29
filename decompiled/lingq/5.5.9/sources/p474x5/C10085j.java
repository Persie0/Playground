package p474x5;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003a2.C0009a;

/* JADX INFO: renamed from: x5.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10085j implements InterfaceC10083h {

    /* JADX INFO: renamed from: b */
    public final Map<String, List<InterfaceC10084i>> f51164b;

    /* JADX INFO: renamed from: c */
    public volatile Map<String, String> f51165c;

    /* JADX INFO: renamed from: x5.j$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final Map<String, List<InterfaceC10084i>> f51166b;

        /* JADX INFO: renamed from: a */
        public final Map<String, List<InterfaceC10084i>> f51167a = f51166b;

        /* JADX WARN: Code duplicated, block: B:15:0x003f  */
        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb2 = new StringBuilder(property.length());
                for (int i10 = 0; i10 < length; i10++) {
                    char cCharAt = property.charAt(i10);
                    if (cCharAt <= 31 && cCharAt != '\t') {
                        sb2.append('?');
                    } else if (cCharAt < 127) {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append('?');
                    }
                }
                property = sb2.toString();
            }
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put("User-Agent", Collections.singletonList(new b(property)));
            }
            f51166b = Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: renamed from: x5.j$b */
    public static final class b implements InterfaceC10084i {

        /* JADX INFO: renamed from: a */
        public final String f51168a;

        public b(String str) {
            this.f51168a = str;
        }

        @Override // p474x5.InterfaceC10084i
        /* JADX INFO: renamed from: a */
        public final String mo18935a() {
            return this.f51168a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f51168a.equals(((b) obj).f51168a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f51168a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("StringHeaderFactory{value='"), this.f51168a, "'}");
        }
    }

    public C10085j(Map<String, List<InterfaceC10084i>> map) {
        this.f51164b = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: a */
    public final HashMap m18936a() {
        HashMap map = new HashMap();
        for (Map.Entry<String, List<InterfaceC10084i>> entry : this.f51164b.entrySet()) {
            List<InterfaceC10084i> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            int size = value.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strMo18935a = value.get(i10).mo18935a();
                if (!TextUtils.isEmpty(strMo18935a)) {
                    sb2.append(strMo18935a);
                    if (i10 != value.size() - 1) {
                        sb2.append(',');
                    }
                }
            }
            String string = sb2.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10085j) {
            return this.f51164b.equals(((C10085j) obj).f51164b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f51164b.hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p474x5.InterfaceC10083h
    /* JADX INFO: renamed from: i */
    public final Map<String, String> mo18934i() {
        if (this.f51165c == null) {
            synchronized (this) {
                if (this.f51165c == null) {
                    this.f51165c = Collections.unmodifiableMap(m18936a());
                }
            }
        }
        return this.f51165c;
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.f51164b + '}';
    }
}
