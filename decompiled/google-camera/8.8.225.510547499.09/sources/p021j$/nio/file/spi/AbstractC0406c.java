package p021j$.nio.file.spi;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p021j$.desugar.sun.nio.p023fs.AbstractC0293g;
import p021j$.nio.channels.AbstractC0308c;
import p021j$.nio.file.AbstractC0392h;
import p021j$.nio.file.AbstractC0395k;
import p021j$.nio.file.EnumC0315D;
import p021j$.nio.file.EnumC0386b;
import p021j$.nio.file.Files;
import p021j$.nio.file.InterfaceC0389e;
import p021j$.nio.file.InterfaceC0401q;
import p021j$.nio.file.LinkOption;
import p021j$.nio.file.Path;
import p021j$.nio.file.attribute.BasicFileAttributes;
import p021j$.nio.file.attribute.FileAttribute;
import p021j$.nio.file.attribute.InterfaceC0382w;

/* JADX INFO: renamed from: j$.nio.file.spi.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0406c {

    /* JADX INFO: renamed from: a */
    private static final Set f32892a = AbstractC0293g.m11980c(new Object[]{EnumC0315D.CREATE, EnumC0315D.TRUNCATE_EXISTING, EnumC0315D.WRITE});

    protected AbstractC0406c() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo12002A(Path path, String str, Object obj, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: a */
    public abstract void mo12003a(Path path, EnumC0386b... enumC0386bArr);

    /* JADX INFO: renamed from: b */
    public abstract void mo12004b(Path path, Path path2, InterfaceC0389e... interfaceC0389eArr);

    /* JADX INFO: renamed from: c */
    public abstract void mo12005c(Path path, FileAttribute... fileAttributeArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo12006d(Path path, Path path2);

    /* JADX INFO: renamed from: e */
    public abstract void mo12007e(Path path, Path path2, FileAttribute... fileAttributeArr);

    /* JADX INFO: renamed from: f */
    public abstract void mo12008f(Path path);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo12009g(Path path);

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC0382w mo12010h(Path path, Class cls, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: i */
    public abstract AbstractC0392h mo12011i(Path path);

    /* JADX INFO: renamed from: j */
    public abstract AbstractC0395k mo12012j(URI uri);

    /* JADX INFO: renamed from: k */
    public abstract Path mo12013k(URI uri);

    /* JADX INFO: renamed from: l */
    public abstract String mo12014l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo12015m(Path path);

    /* JADX INFO: renamed from: n */
    public abstract boolean mo12016n(Path path, Path path2);

    /* JADX INFO: renamed from: o */
    public abstract void mo12017o(Path path, Path path2, InterfaceC0389e... interfaceC0389eArr);

    /* JADX INFO: renamed from: p */
    public abstract AbstractC0308c mo12018p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr);

    /* JADX INFO: renamed from: q */
    public abstract SeekableByteChannel mo12019q(Path path, Set set, FileAttribute... fileAttributeArr);

    /* JADX INFO: renamed from: r */
    public abstract DirectoryStream mo12020r(Path path, DirectoryStream.Filter filter);

    /* JADX INFO: renamed from: s */
    public abstract FileChannel mo12021s(Path path, Set set, FileAttribute... fileAttributeArr);

    /* JADX INFO: renamed from: t */
    public AbstractC0395k mo12215t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC0395k mo12022u(URI uri, Map map);

    /* JADX INFO: renamed from: v */
    public InputStream mo12216v(Path path, InterfaceC0401q... interfaceC0401qArr) {
        Set setEmptySet;
        if (interfaceC0401qArr.length > 0) {
            for (InterfaceC0401q interfaceC0401q : interfaceC0401qArr) {
                if (interfaceC0401q == EnumC0315D.APPEND || interfaceC0401q == EnumC0315D.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(interfaceC0401q) + "' not allowed");
                }
            }
        }
        int i = Files.f32821b;
        if (interfaceC0401qArr.length == 0) {
            setEmptySet = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet();
            Collections.addAll(hashSet, interfaceC0401qArr);
            setEmptySet = hashSet;
        }
        return Channels.newInputStream(path.getFileSystem().mo11994j().mo12019q(path, setEmptySet, new FileAttribute[0]));
    }

    /* JADX INFO: renamed from: w */
    public OutputStream mo12217w(Path path, InterfaceC0401q... interfaceC0401qArr) {
        Set set;
        if (interfaceC0401qArr.length == 0) {
            set = f32892a;
        } else {
            HashSet hashSet = new HashSet();
            for (InterfaceC0401q interfaceC0401q : interfaceC0401qArr) {
                if (interfaceC0401q == EnumC0315D.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(interfaceC0401q);
            }
            hashSet.add(EnumC0315D.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(mo12019q(path, set, new FileAttribute[0]));
    }

    /* JADX INFO: renamed from: x */
    public abstract BasicFileAttributes mo12023x(Path path, Class cls, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: y */
    public abstract Map mo12024y(Path path, String str, LinkOption... linkOptionArr);

    /* JADX INFO: renamed from: z */
    public abstract Path mo12025z(Path path);
}
