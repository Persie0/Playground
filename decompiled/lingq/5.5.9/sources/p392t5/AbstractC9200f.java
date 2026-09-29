package p392t5;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: renamed from: t5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9200f {

    /* JADX INFO: renamed from: a */
    public static final b f47748a;

    /* JADX INFO: renamed from: b */
    public static final c f47749b;

    /* JADX INFO: renamed from: c */
    public static final e f47750c;

    /* JADX INFO: renamed from: t5.f$a */
    public class a extends AbstractC9200f {
        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: a */
        public final boolean mo17537a() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: b */
        public final boolean mo17538b() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: c */
        public final boolean mo17539c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: d */
        public final boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: t5.f$b */
    public class b extends AbstractC9200f {
        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: a */
        public final boolean mo17537a() {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: b */
        public final boolean mo17538b() {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: c */
        public final boolean mo17539c(DataSource dataSource) {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: d */
        public final boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t5.f$c */
    public class c extends AbstractC9200f {
        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: a */
        public final boolean mo17537a() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: b */
        public final boolean mo17538b() {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: c */
        public final boolean mo17539c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: d */
        public final boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t5.f$d */
    public class d extends AbstractC9200f {
        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: a */
        public final boolean mo17537a() {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: b */
        public final boolean mo17538b() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: c */
        public final boolean mo17539c(DataSource dataSource) {
            return false;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: d */
        public final boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* JADX INFO: renamed from: t5.f$e */
    public class e extends AbstractC9200f {
        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: a */
        public final boolean mo17537a() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: b */
        public final boolean mo17538b() {
            return true;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: c */
        public final boolean mo17539c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // p392t5.AbstractC9200f
        /* JADX INFO: renamed from: d */
        public final boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z10 && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    static {
        new a();
        f47748a = new b();
        f47749b = new c();
        new d();
        f47750c = new e();
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo17537a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo17538b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo17539c(DataSource dataSource);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo17540d(boolean z10, DataSource dataSource, EncodeStrategy encodeStrategy);
}
