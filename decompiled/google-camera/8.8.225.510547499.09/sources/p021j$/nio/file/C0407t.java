package p021j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p021j$.lang.Iterable$EL;
import p021j$.util.C0500C;

/* JADX INFO: renamed from: j$.nio.file.t */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0407t implements Path {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Path f32893a;

    private /* synthetic */ C0407t(Path path) {
        this.f32893a = path;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Path m12219a(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C0403s ? ((C0403s) path).f32889a : new C0407t(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f32893a.compareTo(AbstractC0335a.m12109h(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f32893a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.f32893a;
        if (obj instanceof C0407t) {
            obj = ((C0407t) obj).f32893a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super Path> consumer) {
        Iterable$EL.m12057a(this.f32893a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return m12219a(this.f32893a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return C0394j.m12210b(this.f32893a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return m12219a(this.f32893a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f32893a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return m12219a(this.f32893a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return m12219a(this.f32893a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f32893a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f32893a.isAbsolute();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C0412y(this.f32893a.iterator());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return m12219a(this.f32893a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        return C0327P.m12094a(this.f32893a.mo12030d(C0329S.m12095b(watchService), AbstractC0392h.m12206k(kindArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path relativize(Path path) {
        return m12219a(this.f32893a.mo12040w(C0403s.m12213a(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return m12219a(this.f32893a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return m12219a(this.f32893a.resolveSibling(str));
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Spliterator<Path> spliterator() {
        return C0500C.m12500a(Iterable$EL.spliterator(this.f32893a));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f32893a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return m12219a(this.f32893a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return m12219a(this.f32893a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f32893a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path toRealPath(LinkOption[] linkOptionArr) {
        return m12219a(this.f32893a.mo12037p(AbstractC0392h.m12205j(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f32893a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f32893a.toUri();
    }

    @Override // java.nio.file.Path
    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(Path path) {
        return this.f32893a.compareTo(C0403s.m12213a(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(Path path) {
        return this.f32893a.mo12041x(C0403s.m12213a(path));
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        InterfaceC0322K[] interfaceC0322KArr;
        Path path = this.f32893a;
        InterfaceC0331U interfaceC0331UM12095b = C0329S.m12095b(watchService);
        InterfaceC0319H[] interfaceC0319HArrM12206k = AbstractC0392h.m12206k(kindArr);
        if (modifierArr == null) {
            interfaceC0322KArr = null;
        } else {
            int length = modifierArr.length;
            InterfaceC0322K[] interfaceC0322KArr2 = new InterfaceC0322K[length];
            for (int i = 0; i < length; i++) {
                interfaceC0322KArr2[i] = C0320I.m12080a(modifierArr[i]);
            }
            interfaceC0322KArr = interfaceC0322KArr2;
        }
        return C0327P.m12094a(path.mo12028b(interfaceC0331UM12095b, interfaceC0319HArrM12206k, interfaceC0322KArr));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolve(Path path) {
        return m12219a(this.f32893a.mo12036o(C0403s.m12213a(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ Path resolveSibling(Path path) {
        return m12219a(this.f32893a.mo12033g(C0403s.m12213a(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(Path path) {
        return this.f32893a.mo12039v(C0403s.m12213a(path));
    }
}
