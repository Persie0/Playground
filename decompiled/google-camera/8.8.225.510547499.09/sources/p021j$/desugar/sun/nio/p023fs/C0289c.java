package p021j$.desugar.sun.nio.p023fs;

import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.C0340E;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.c */
/* JADX INFO: loaded from: classes3.dex */
final class C0289c implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    private final C0340E f32767a;

    /* JADX INFO: renamed from: b */
    private final C0340E f32768b;

    /* JADX INFO: renamed from: c */
    private final C0340E f32769c;

    /* JADX INFO: renamed from: d */
    private final boolean f32770d;

    /* JADX INFO: renamed from: e */
    private final boolean f32771e;

    /* JADX INFO: renamed from: f */
    private final boolean f32772f;

    /* JADX INFO: renamed from: g */
    private final boolean f32773g;

    /* JADX INFO: renamed from: h */
    private final long f32774h;

    /* JADX INFO: renamed from: i */
    private final Object f32775i;

    public C0289c(C0340E c0340e, C0340E c0340e2, C0340E c0340e3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.f32767a = c0340e;
        this.f32768b = c0340e2;
        this.f32769c = c0340e3;
        this.f32770d = z;
        this.f32771e = z2;
        this.f32772f = z3;
        this.f32773g = z4;
        this.f32774h = j;
        this.f32775i = num;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final C0340E creationTime() {
        return this.f32769c;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.f32775i;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.f32771e;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.f32773g;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.f32770d;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f32772f;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final C0340E lastAccessTime() {
        return this.f32768b;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final C0340E lastModifiedTime() {
        return this.f32767a;
    }

    @Override // p021j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.f32774h;
    }
}
