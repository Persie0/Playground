package p021j$.nio.file;

import java.nio.file.AccessMode;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p021j$.nio.file.attribute.AbstractC0379t;
import p021j$.nio.file.attribute.C0340E;
import p021j$.nio.file.attribute.EnumC0350O;
import p021j$.nio.file.attribute.InterfaceC0346K;
import p021j$.nio.file.attribute.InterfaceC0349N;
import p021j$.nio.file.attribute.InterfaceC0353S;
import p021j$.nio.file.attribute.InterfaceC0362c;
import p021j$.nio.file.attribute.InterfaceC0366g;
import p021j$.nio.file.attribute.InterfaceC0371l;
import p021j$.nio.file.attribute.InterfaceC0374o;
import p021j$.nio.file.attribute.InterfaceC0385z;
import p021j$.util.C0548f;

/* JADX INFO: renamed from: j$.nio.file.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0335a {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ EnumC0386b m12102a(AccessMode accessMode) {
        if (accessMode == null) {
            return null;
        }
        if (accessMode == AccessMode.READ) {
            return EnumC0386b.READ;
        }
        return accessMode == AccessMode.WRITE ? EnumC0386b.WRITE : EnumC0386b.EXECUTE;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0319H m12103b(WatchEvent.Kind kind) {
        if (kind == null) {
            return null;
        }
        if (kind == StandardWatchEventKinds.ENTRY_CREATE) {
            return AbstractC0392h.f32878b;
        }
        if (kind == StandardWatchEventKinds.ENTRY_DELETE) {
            return AbstractC0392h.f32879c;
        }
        if (kind == StandardWatchEventKinds.ENTRY_MODIFY) {
            return AbstractC0392h.f32880d;
        }
        return kind == StandardWatchEventKinds.OVERFLOW ? AbstractC0392h.f32877a : C0317F.m12076a(kind);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AccessMode m12104c(EnumC0386b enumC0386b) {
        if (enumC0386b == null) {
            return null;
        }
        if (enumC0386b == EnumC0386b.READ) {
            return AccessMode.READ;
        }
        return enumC0386b == EnumC0386b.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ LinkOption m12105d(LinkOption linkOption) {
        if (linkOption == null) {
            return null;
        }
        return LinkOption.NOFOLLOW_LINKS;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ StandardCopyOption m12106e(EnumC0314C enumC0314C) {
        if (enumC0314C == null) {
            return null;
        }
        if (enumC0314C == EnumC0314C.REPLACE_EXISTING) {
            return StandardCopyOption.REPLACE_EXISTING;
        }
        return enumC0314C == EnumC0314C.COPY_ATTRIBUTES ? StandardCopyOption.COPY_ATTRIBUTES : StandardCopyOption.ATOMIC_MOVE;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ StandardOpenOption m12107f(EnumC0315D enumC0315D) {
        if (enumC0315D == null) {
            return null;
        }
        if (enumC0315D == EnumC0315D.READ) {
            return StandardOpenOption.READ;
        }
        if (enumC0315D == EnumC0315D.WRITE) {
            return StandardOpenOption.WRITE;
        }
        if (enumC0315D == EnumC0315D.APPEND) {
            return StandardOpenOption.APPEND;
        }
        if (enumC0315D == EnumC0315D.TRUNCATE_EXISTING) {
            return StandardOpenOption.TRUNCATE_EXISTING;
        }
        if (enumC0315D == EnumC0315D.CREATE) {
            return StandardOpenOption.CREATE;
        }
        if (enumC0315D == EnumC0315D.CREATE_NEW) {
            return StandardOpenOption.CREATE_NEW;
        }
        if (enumC0315D == EnumC0315D.DELETE_ON_CLOSE) {
            return StandardOpenOption.DELETE_ON_CLOSE;
        }
        if (enumC0315D == EnumC0315D.SPARSE) {
            return StandardOpenOption.SPARSE;
        }
        return enumC0315D == EnumC0315D.SYNC ? StandardOpenOption.SYNC : StandardOpenOption.DSYNC;
    }

    /* JADX INFO: renamed from: g */
    public static WatchEvent.Kind m12108g(InterfaceC0319H interfaceC0319H) {
        if (interfaceC0319H == null) {
            return null;
        }
        if (interfaceC0319H == AbstractC0392h.f32878b) {
            return StandardWatchEventKinds.ENTRY_CREATE;
        }
        if (interfaceC0319H == AbstractC0392h.f32879c) {
            return StandardWatchEventKinds.ENTRY_DELETE;
        }
        if (interfaceC0319H == AbstractC0392h.f32880d) {
            return StandardWatchEventKinds.ENTRY_MODIFY;
        }
        return interfaceC0319H == AbstractC0392h.f32877a ? StandardWatchEventKinds.OVERFLOW : C0318G.m12079a(interfaceC0319H);
    }

    /* JADX INFO: renamed from: h */
    public static Object m12109h(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Path) {
            return C0407t.m12219a((Path) obj);
        }
        return obj instanceof Path ? C0403s.m12213a((Path) obj) : obj;
    }

    /* JADX INFO: renamed from: i */
    public static Class m12110i(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributeView.class) {
            return InterfaceC0366g.class;
        }
        if (cls == InterfaceC0366g.class) {
            return BasicFileAttributeView.class;
        }
        if (cls == PosixFileAttributeView.class) {
            return InterfaceC0346K.class;
        }
        if (cls == InterfaceC0346K.class) {
            return PosixFileAttributeView.class;
        }
        if (cls == FileOwnerAttributeView.class) {
            return InterfaceC0385z.class;
        }
        if (cls == InterfaceC0385z.class) {
            return FileOwnerAttributeView.class;
        }
        if (cls == InterfaceC0371l.class) {
            return DosFileAttributeView.class;
        }
        if (cls == DosFileAttributeView.class) {
            return InterfaceC0371l.class;
        }
        if (cls == InterfaceC0353S.class) {
            return UserDefinedFileAttributeView.class;
        }
        if (cls == UserDefinedFileAttributeView.class) {
            return InterfaceC0353S.class;
        }
        if (cls == InterfaceC0362c.class) {
            return AclFileAttributeView.class;
        }
        if (cls == AclFileAttributeView.class) {
            return InterfaceC0362c.class;
        }
        C0548f.m12577a(cls, "java.nio.file.attribute.FileAttributeView");
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public static Class m12111j(Class cls) {
        if (cls == null) {
            return null;
        }
        if (cls == BasicFileAttributes.class) {
            return p021j$.nio.file.attribute.BasicFileAttributes.class;
        }
        if (cls == p021j$.nio.file.attribute.BasicFileAttributes.class) {
            return BasicFileAttributes.class;
        }
        if (cls == PosixFileAttributes.class) {
            return InterfaceC0349N.class;
        }
        if (cls == InterfaceC0349N.class) {
            return PosixFileAttributes.class;
        }
        if (cls == InterfaceC0374o.class) {
            return DosFileAttributes.class;
        }
        if (cls == DosFileAttributes.class) {
            return InterfaceC0374o.class;
        }
        C0548f.m12577a(cls, "java.nio.file.attribute.BasicFileAttributes");
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static Map m12112k(Map map) {
        if (map == null || map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap();
        for (String str : map.keySet()) {
            map2.put(str, m12113l(map.get(str)));
        }
        return map2;
    }

    /* JADX INFO: renamed from: l */
    public static Object m12113l(Object obj) {
        if (obj instanceof FileTime) {
            try {
                return AbstractC0379t.m12180b((FileTime) obj);
            } catch (ClassCastException e) {
                C0548f.m12577a(e, "java.nio.file.attribute.FileTime");
                throw null;
            }
        }
        if (!(obj instanceof C0340E)) {
            return obj;
        }
        try {
            return AbstractC0379t.m12182d((C0340E) obj);
        } catch (ClassCastException e2) {
            C0548f.m12577a(e2, "java.nio.file.attribute.FileTime");
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static Set m12114m(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof InterfaceC0401q) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(C0400p.m12212a((InterfaceC0401q) it.next()));
                } catch (ClassCastException e) {
                    C0548f.m12577a(e, "java.nio.file.OpenOption");
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof OpenOption)) {
            C0548f.m12577a(next.getClass(), "java.nio.file.OpenOption");
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                hashSet.add(C0399o.m12211a((OpenOption) it2.next()));
            } catch (ClassCastException e2) {
                C0548f.m12577a(e2, "java.nio.file.OpenOption");
                throw null;
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: n */
    public static Set m12115n(Set set) {
        EnumC0350O enumC0350O;
        PosixFilePermission posixFilePermission;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC0350O) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC0350O enumC0350O2 = (EnumC0350O) it.next();
                    if (enumC0350O2 == null) {
                        posixFilePermission = null;
                    } else if (enumC0350O2 == EnumC0350O.OWNER_READ) {
                        posixFilePermission = PosixFilePermission.OWNER_READ;
                    } else if (enumC0350O2 == EnumC0350O.OWNER_WRITE) {
                        posixFilePermission = PosixFilePermission.OWNER_WRITE;
                    } else if (enumC0350O2 == EnumC0350O.OWNER_EXECUTE) {
                        posixFilePermission = PosixFilePermission.OWNER_EXECUTE;
                    } else if (enumC0350O2 == EnumC0350O.GROUP_READ) {
                        posixFilePermission = PosixFilePermission.GROUP_READ;
                    } else if (enumC0350O2 == EnumC0350O.GROUP_WRITE) {
                        posixFilePermission = PosixFilePermission.GROUP_WRITE;
                    } else if (enumC0350O2 == EnumC0350O.GROUP_EXECUTE) {
                        posixFilePermission = PosixFilePermission.GROUP_EXECUTE;
                    } else if (enumC0350O2 == EnumC0350O.OTHERS_READ) {
                        posixFilePermission = PosixFilePermission.OTHERS_READ;
                    } else {
                        posixFilePermission = enumC0350O2 == EnumC0350O.OTHERS_WRITE ? PosixFilePermission.OTHERS_WRITE : PosixFilePermission.OTHERS_EXECUTE;
                    }
                    hashSet.add(posixFilePermission);
                } catch (ClassCastException e) {
                    C0548f.m12577a(e, "java.nio.file.attribute.PosixFilePermission");
                    throw null;
                }
            }
            return hashSet;
        }
        if (!(next instanceof PosixFilePermission)) {
            C0548f.m12577a(next.getClass(), "java.nio.file.attribute.PosixFilePermission");
            throw null;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                PosixFilePermission posixFilePermission2 = (PosixFilePermission) it2.next();
                if (posixFilePermission2 == null) {
                    enumC0350O = null;
                } else if (posixFilePermission2 == PosixFilePermission.OWNER_READ) {
                    enumC0350O = EnumC0350O.OWNER_READ;
                } else if (posixFilePermission2 == PosixFilePermission.OWNER_WRITE) {
                    enumC0350O = EnumC0350O.OWNER_WRITE;
                } else if (posixFilePermission2 == PosixFilePermission.OWNER_EXECUTE) {
                    enumC0350O = EnumC0350O.OWNER_EXECUTE;
                } else if (posixFilePermission2 == PosixFilePermission.GROUP_READ) {
                    enumC0350O = EnumC0350O.GROUP_READ;
                } else if (posixFilePermission2 == PosixFilePermission.GROUP_WRITE) {
                    enumC0350O = EnumC0350O.GROUP_WRITE;
                } else if (posixFilePermission2 == PosixFilePermission.GROUP_EXECUTE) {
                    enumC0350O = EnumC0350O.GROUP_EXECUTE;
                } else if (posixFilePermission2 == PosixFilePermission.OTHERS_READ) {
                    enumC0350O = EnumC0350O.OTHERS_READ;
                } else {
                    enumC0350O = posixFilePermission2 == PosixFilePermission.OTHERS_WRITE ? EnumC0350O.OTHERS_WRITE : EnumC0350O.OTHERS_EXECUTE;
                }
                hashSet.add(enumC0350O);
            } catch (ClassCastException e2) {
                C0548f.m12577a(e2, "java.nio.file.attribute.PosixFilePermission");
                throw null;
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: o */
    public static List m12116o(List list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = list.get(0);
        if (obj instanceof InterfaceC0325N) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(C0324M.m12087a((InterfaceC0325N) it.next()));
                } catch (ClassCastException e) {
                    C0548f.m12577a(e, "java.nio.file.WatchEvent");
                    throw null;
                }
            }
            return arrayList;
        }
        if (!(obj instanceof WatchEvent)) {
            C0548f.m12577a(obj.getClass(), "java.nio.file.WatchEvent");
            throw null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                arrayList.add(C0323L.m12083b((WatchEvent) it2.next()));
            } catch (ClassCastException e2) {
                C0548f.m12577a(e2, "java.nio.file.WatchEvent");
                throw null;
            }
        }
        return arrayList;
    }
}
