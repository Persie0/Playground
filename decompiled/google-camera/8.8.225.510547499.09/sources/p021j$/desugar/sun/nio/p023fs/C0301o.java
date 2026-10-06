package p021j$.desugar.sun.nio.p023fs;

import java.io.File;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p021j$.nio.file.AbstractC0392h;
import p021j$.nio.file.AbstractC0395k;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.InterfaceC0319H;
import p021j$.nio.file.InterfaceC0322K;
import p021j$.nio.file.InterfaceC0328Q;
import p021j$.nio.file.InterfaceC0331U;
import p021j$.nio.file.LinkOption;
import p021j$.nio.file.Path;
import p021j$.util.DesugarArrays;
import p021j$.util.stream.Collectors;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C0301o implements Path {

    /* JADX INFO: renamed from: h */
    private static final Pattern f32795h = Pattern.compile("/+");

    /* JADX INFO: renamed from: a */
    private final AbstractC0395k f32796a;

    /* JADX INFO: renamed from: b */
    private final String f32797b;

    /* JADX INFO: renamed from: c */
    private final List f32798c;

    /* JADX INFO: renamed from: d */
    private final boolean f32799d;

    /* JADX INFO: renamed from: e */
    private final String f32800e;

    /* JADX INFO: renamed from: f */
    private final String f32801f;

    /* JADX INFO: renamed from: g */
    private volatile byte[] f32802g;

    public C0301o(AbstractC0395k abstractC0395k, String str, String str2, String str3) {
        this(abstractC0395k, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(f32795h.split(str)).filter(new C0300n()).collect(Collectors.m12617a()), str2, str3);
    }

    /* JADX INFO: renamed from: a */
    final byte[] m12027a() {
        if (this.f32802g == null) {
            this.f32802g = this.f32797b.getBytes(AbstractC0303q.m12048a());
        }
        return this.f32802g;
    }

    @Override // p021j$.nio.file.Path, p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: b */
    public final InterfaceC0328Q mo12028b(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr, InterfaceC0322K... interfaceC0322KArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C0301o getName(int i) {
        if (i < 0 || i >= getNameCount()) {
            throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
        }
        return new C0301o(this.f32796a, (String) this.f32798c.get(i), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path, p021j$.nio.file.InterfaceC0334X
    /* JADX INFO: renamed from: d */
    public final InterfaceC0328Q mo12030d(InterfaceC0331U interfaceC0331U, InterfaceC0319H... interfaceC0319HArr) {
        mo12028b(interfaceC0331U, interfaceC0319HArr, new InterfaceC0322K[0]);
        throw null;
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0301o getParent() {
        int nameCount = getNameCount();
        if (nameCount == 0) {
            return null;
        }
        boolean z = this.f32799d;
        if (nameCount == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(AbstractC0293g.m11978a(this.f32798c.subList(0, nameCount - 1)));
        return new C0301o(this.f32796a, sb.toString(), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    public final boolean endsWith(String str) {
        return mo12041x(new C0301o(this.f32796a, str, this.f32800e, this.f32801f));
    }

    @Override // p021j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof C0301o) && compareTo((C0301o) obj) == 0;
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0301o mo12036o(Path path) {
        if (!(path instanceof C0301o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (path.isAbsolute()) {
            return (C0301o) path;
        }
        return new C0301o(this.f32796a, this.f32797b + "/" + String.valueOf(path), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    public final Path getFileName() {
        List list = this.f32798c;
        if (list.isEmpty()) {
            if (this.f32799d) {
                return null;
            }
            return this;
        }
        return new C0301o(this.f32796a, (String) list.get(getNameCount() - 1), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    public final AbstractC0395k getFileSystem() {
        return this.f32796a;
    }

    @Override // p021j$.nio.file.Path
    public final int getNameCount() {
        return this.f32798c.size();
    }

    @Override // p021j$.nio.file.Path
    public final Path getRoot() {
        if (!this.f32799d) {
            return null;
        }
        String str = this.f32800e;
        AbstractC0395k abstractC0395k = this.f32796a;
        String str2 = this.f32801f;
        return new C0301o(abstractC0395k, str2, str, str2);
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C0301o mo12033g(Path path) {
        path.getClass();
        if (!(path instanceof C0301o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        C0301o parent = getParent();
        return parent == null ? (C0301o) path : parent.mo12036o(path);
    }

    @Override // p021j$.nio.file.Path
    public final int hashCode() {
        return this.f32797b.hashCode();
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final C0301o toAbsolutePath() {
        if (this.f32799d) {
            return this;
        }
        String str = this.f32801f;
        AbstractC0395k abstractC0395k = this.f32796a;
        String str2 = this.f32800e;
        return new C0301o(abstractC0395k, str2, str2, str).mo12036o(this);
    }

    @Override // p021j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.f32799d;
    }

    @Override // p021j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0392h.m12203a(this);
    }

    @Override // p021j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f32798c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new C0301o(this.f32796a, (this.f32799d ? "/" : "") + AbstractC0293g.m11978a(arrayDeque), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: p */
    public final Path mo12037p(LinkOption[] linkOptionArr) {
        AbstractC0395k abstractC0395k = this.f32796a;
        abstractC0395k.mo11994j().mo12003a(this, EnumC0386b.READ);
        return Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new C0301o(abstractC0395k, toFile().getCanonicalPath(), this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    public final Path resolve(String str) {
        return mo12036o(getFileSystem().mo11987c(str, new String[0]));
    }

    @Override // p021j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return mo12033g(new C0301o(this.f32796a, str, this.f32800e, this.f32801f));
    }

    @Override // p021j$.nio.file.Path
    public final boolean startsWith(String str) {
        return mo12039v(new C0301o(this.f32796a, str, this.f32800e, this.f32801f));
    }

    @Override // p021j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new C0301o(this.f32796a, AbstractC0293g.m11978a(this.f32798c.subList(i, i2)), this.f32800e, this.f32801f);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.f32797b.compareTo(((C0301o) path).f32797b);
    }

    @Override // p021j$.nio.file.Path
    public final File toFile() {
        return new File(this.f32797b);
    }

    @Override // p021j$.nio.file.Path
    public final String toString() {
        return this.f32797b;
    }

    @Override // p021j$.nio.file.Path
    public final URI toUri() {
        return AbstractC0302p.m12047f(this);
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: v */
    public final boolean mo12039v(Path path) {
        int nameCount;
        path.getClass();
        if (!(path instanceof C0301o)) {
            return false;
        }
        if (this.f32799d != path.isAbsolute() || getNameCount() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: w */
    public final Path mo12040w(Path path) {
        int i = 0;
        if (!(path instanceof C0301o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.f32799d != path.isAbsolute()) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = this.f32798c;
        int size = list.size();
        List list2 = ((C0301o) path).f32798c;
        int size2 = list2.size();
        while (i < size && i < size2 && ((String) list.get(i)).equals(list2.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list2.get(i));
            i++;
        }
        return new C0301o(this.f32796a, false, arrayList, this.f32800e, this.f32801f);
    }

    @Override // p021j$.nio.file.Path
    /* JADX INFO: renamed from: x */
    public final boolean mo12041x(Path path) {
        path.getClass();
        if (!(path instanceof C0301o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        if (getNameCount() < nameCount) {
            return false;
        }
        int nameCount2 = getNameCount();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + nameCount2).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    private C0301o(AbstractC0395k abstractC0395k, boolean z, List list, String str, String str2) {
        this.f32796a = abstractC0395k;
        this.f32799d = z;
        this.f32798c = list;
        String str3 = z ? "/" : "";
        this.f32797b = str3 + AbstractC0293g.m11978a(list);
        this.f32800e = str;
        this.f32801f = str2;
    }
}
