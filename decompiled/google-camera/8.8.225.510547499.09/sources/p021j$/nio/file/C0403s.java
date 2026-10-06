package p021j$.nio.file;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;
import p021j$.lang.InterfaceC0305a;
import p021j$.lang.Iterable$EL;
import p021j$.util.C0499B;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.nio.file.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0403s implements Path, InterfaceC0305a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Path f32889a;

    private /* synthetic */ C0403s(Path path) {
        this.f32889a = path;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Path m12213a(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof C0407t ? ((C0407t) path).f32893a : new C0403s(path);
    }

    @Override // p021j$.nio.file.Path, p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0328Q mo12028b(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr, InterfaceC0322K[] interfaceC0322KArr) {
        WatchEvent.Modifier[] modifierArr;
        WatchService watchServiceM12099b = C0330T.m12099b(interfaceC0331U);
        WatchEvent.Kind<?>[] kindArrM12208m = AbstractC0392h.m12208m(interfaceC0319HArr);
        if (interfaceC0322KArr == null) {
            modifierArr = null;
        } else {
            int length = interfaceC0322KArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                modifierArr2[i] = C0321J.m12082a(interfaceC0322KArr[i]);
            }
            modifierArr = modifierArr2;
        }
        return C0326O.m12088b(this.f32889a.register(watchServiceM12099b, kindArrM12208m, modifierArr));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f32889a.compareTo(AbstractC0335a.m12109h(path));
    }

    @Override // p021j$.nio.file.Path, p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC0328Q mo12030d(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr) {
        return C0326O.m12088b(this.f32889a.register(C0330T.m12099b(interfaceC0331U), AbstractC0392h.m12208m(interfaceC0319HArr)));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f32889a.endsWith(str);
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0403s) {
            obj = ((C0403s) obj).f32889a;
        }
        return this.f32889a.equals(obj);
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.m12057a(this.f32889a, consumer);
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Path mo12033g(Path path) {
        return m12213a(this.f32889a.resolveSibling(C0407t.m12219a(path)));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return m12213a(this.f32889a.getFileName());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ AbstractC0395k getFileSystem() {
        return C0393i.m12209l(this.f32889a.getFileSystem());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return m12213a(this.f32889a.getName(i));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f32889a.getNameCount();
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return m12213a(this.f32889a.getParent());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return m12213a(this.f32889a.getRoot());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.f32889a.hashCode();
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f32889a.isAbsolute();
    }

    @Override // p021j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new C0412y(this.f32889a.iterator());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return m12213a(this.f32889a.normalize());
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Path mo12036o(Path path) {
        return m12213a(this.f32889a.resolve(C0407t.m12219a(path)));
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Path mo12037p(LinkOption[] linkOptionArr) {
        return m12213a(this.f32889a.toRealPath(AbstractC0392h.m12207l(linkOptionArr)));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return m12213a(this.f32889a.resolve(str));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return m12213a(this.f32889a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final /* synthetic */ Spliterator spliterator() {
        return C0499B.m12499a(this.f32889a.spliterator());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f32889a.startsWith(str);
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return m12213a(this.f32889a.subpath(i, i2));
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int compareTo(Path path) {
        return this.f32889a.compareTo(C0407t.m12219a(path));
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return m12213a(this.f32889a.toAbsolutePath());
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f32889a.toFile();
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f32889a.toString();
    }

    @Override // p021j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f32889a.toUri();
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean mo12039v(Path path) {
        return this.f32889a.startsWith(C0407t.m12219a(path));
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Path mo12040w(Path path) {
        return m12213a(this.f32889a.relativize(C0407t.m12219a(path)));
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean mo12041x(Path path) {
        return this.f32889a.endsWith(C0407t.m12219a(path));
    }
}
