package p000;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache$Key;

/* JADX INFO: loaded from: classes.dex */
public final class hn9 extends f04 {

    /* JADX INFO: renamed from: a */
    public final Drawable f42663a;

    /* JADX INFO: renamed from: b */
    public final e04 f42664b;

    /* JADX INFO: renamed from: c */
    public final DataSource f42665c;

    /* JADX INFO: renamed from: d */
    public final MemoryCache$Key f42666d;

    /* JADX INFO: renamed from: e */
    public final String f42667e;

    /* JADX INFO: renamed from: f */
    public final boolean f42668f;

    /* JADX INFO: renamed from: g */
    public final boolean f42669g;

    public hn9(Drawable drawable, e04 e04Var, DataSource dataSource, MemoryCache$Key memoryCache$Key, String str, boolean z, boolean z2) {
        this.f42663a = drawable;
        this.f42664b = e04Var;
        this.f42665c = dataSource;
        this.f42666d = memoryCache$Key;
        this.f42667e = str;
        this.f42668f = z;
        this.f42669g = z2;
    }

    @Override // p000.f04
    /* JADX INFO: renamed from: a */
    public final Drawable mo11418a() {
        return this.f42663a;
    }

    @Override // p000.f04
    /* JADX INFO: renamed from: b */
    public final e04 mo11419b() {
        return this.f42664b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn9)) {
            return false;
        }
        hn9 hn9Var = (hn9) obj;
        return fa4.m11650l(this.f42663a, hn9Var.f42663a) && fa4.m11650l(this.f42664b, hn9Var.f42664b) && this.f42665c == hn9Var.f42665c && fa4.m11650l(this.f42666d, hn9Var.f42666d) && fa4.m11650l(this.f42667e, hn9Var.f42667e) && this.f42668f == hn9Var.f42668f && this.f42669g == hn9Var.f42669g;
    }

    public final int hashCode() {
        int iHashCode = (this.f42665c.hashCode() + ((this.f42664b.hashCode() + (this.f42663a.hashCode() * 31)) * 31)) * 31;
        MemoryCache$Key memoryCache$Key = this.f42666d;
        int iHashCode2 = (iHashCode + (memoryCache$Key != null ? memoryCache$Key.hashCode() : 0)) * 31;
        String str = this.f42667e;
        return Boolean.hashCode(this.f42669g) + g9a.m12428e((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f42668f);
    }
}
