package p021j$.nio.file;

import java.io.File;
import java.net.URI;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface Path extends Comparable<Path>, Iterable<Path>, InterfaceC0334X {
    /* JADX INFO: renamed from: b */
    InterfaceC0328Q mo12028b(InterfaceC0331U interfaceC0331U, InterfaceC0319H[] interfaceC0319HArr, InterfaceC0322K... interfaceC0322KArr);

    /* JADX INFO: renamed from: d */
    InterfaceC0328Q mo12030d(InterfaceC0331U interfaceC0331U, InterfaceC0319H... interfaceC0319HArr);

    boolean endsWith(String str);

    boolean equals(Object obj);

    /* JADX INFO: renamed from: g */
    Path mo12033g(Path path);

    Path getFileName();

    AbstractC0395k getFileSystem();

    Path getName(int i);

    int getNameCount();

    Path getParent();

    Path getRoot();

    int hashCode();

    boolean isAbsolute();

    Iterator iterator();

    Path normalize();

    /* JADX INFO: renamed from: o */
    Path mo12036o(Path path);

    /* JADX INFO: renamed from: p */
    Path mo12037p(LinkOption... linkOptionArr);

    Path resolve(String str);

    Path resolveSibling(String str);

    boolean startsWith(String str);

    Path subpath(int i, int i2);

    /* JADX INFO: renamed from: t */
    int mo12038t(Path path);

    Path toAbsolutePath();

    File toFile();

    String toString();

    URI toUri();

    /* JADX INFO: renamed from: v */
    boolean mo12039v(Path path);

    /* JADX INFO: renamed from: w */
    Path mo12040w(Path path);

    /* JADX INFO: renamed from: x */
    boolean mo12041x(Path path);
}
