package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.ShotMetadata;
import java.util.concurrent.Executor;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class egi {

    /* JADX INFO: renamed from: a */
    public Object f13957a;

    /* JADX INFO: renamed from: b */
    public Object f13958b;

    /* JADX INFO: renamed from: c */
    public Object f13959c;

    /* JADX INFO: renamed from: d */
    public Object f13960d;

    /* JADX INFO: renamed from: e */
    private Object f13961e;

    /* JADX INFO: renamed from: f */
    private Object f13962f;

    public egi(byte[] bArr) {
        this.f13957a = Optional.empty();
        this.f13961e = Optional.empty();
        this.f13962f = Optional.empty();
    }

    /* JADX INFO: renamed from: a */
    public final egj m7297a() {
        Object obj;
        Object obj2;
        Object obj3 = this.f13958b;
        if (obj3 != null && (obj = this.f13959c) != null && (obj2 = this.f13960d) != null) {
            egj egjVar = new egj((Optional) this.f13957a, (Optional) this.f13961e, (Optional) this.f13962f, (ShotMetadata) obj3, (nrt) obj, (mws) obj2);
            lku.m15614I((((Integer) egjVar.f13963a.map(egh.f13936b).orElse(0)).intValue() + ((Integer) egjVar.f13964b.map(egh.f13935a).orElse(0)).intValue()) + ((Integer) egjVar.f13965c.map(egh.f13937c).orElse(0)).intValue() == 1, "Exactly one of rawImage, rgbImage, or lumaDenoisedImage must be set.");
            return egjVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13958b == null) {
            sb.append(" shotMetadata");
        }
        if (this.f13959c == null) {
            sb.append(" makernoteMetadata");
        }
        if (this.f13960d == null) {
            sb.append(" payloadMetadata");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m7298b(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null payloadMetadata");
        }
        this.f13960d = mwsVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m7299c(RawReadView rawReadView) {
        this.f13957a = Optional.m12505of(rawReadView);
    }

    /* JADX INFO: renamed from: d */
    public final void m7300d(InterleavedImageU8 interleavedImageU8) {
        this.f13961e = Optional.m12505of(interleavedImageU8);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cus, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final cut m7301e() {
        ?? r3;
        ?? r4;
        ?? r5;
        Object obj;
        Object obj2 = this.f13959c;
        if (obj2 != null && (r3 = this.f13962f) != 0 && (r4 = this.f13958b) != 0 && (r5 = this.f13961e) != 0 && (obj = this.f13957a) != null) {
            return new cut((hnv) obj2, r3, r4, r5, (String) obj, this.f13960d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f13959c == null) {
            sb.append(" threshold");
        }
        if (this.f13962f == null) {
            sb.append(" onEnable");
        }
        if (this.f13958b == null) {
            sb.append(" onDisable");
        }
        if (this.f13961e == null) {
            sb.append(" executor");
        }
        if (this.f13957a == null) {
            sb.append(" featureName");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m7302f(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Null executor");
        }
        this.f13961e = executor;
    }

    /* JADX INFO: renamed from: g */
    public final void m7303g(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onDisable");
        }
        this.f13958b = runnable;
    }

    /* JADX INFO: renamed from: h */
    public final void m7304h(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Null onEnable");
        }
        this.f13962f = runnable;
    }

    /* JADX INFO: renamed from: i */
    public final void m7305i(hnv hnvVar) {
        if (hnvVar == null) {
            throw new NullPointerException("Null threshold");
        }
        this.f13959c = hnvVar;
    }

    public egi() {
    }
}
