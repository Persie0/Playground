package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.C0870t0;
import androidx.datastore.preferences.protobuf.C0871u;
import androidx.datastore.preferences.protobuf.C0872u0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC0850j0;
import androidx.datastore.preferences.protobuf.InterfaceC0864q0;
import androidx.datastore.preferences.protobuf.InterfaceC0866r0;
import androidx.datastore.preferences.protobuf.InterfaceC0879y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p189j3.C6405a;

/* JADX INFO: renamed from: androidx.datastore.preferences.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0800b extends GeneratedMessageLite<C0800b, a> implements InterfaceC0850j0 {
    private static final C0800b DEFAULT_INSTANCE;
    private static volatile InterfaceC0864q0<C0800b> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0871u.c<String> strings_ = C0870t0.f5932d;

    /* JADX INFO: renamed from: androidx.datastore.preferences.b$a */
    public static final class a extends GeneratedMessageLite.AbstractC0811a<C0800b, a> implements InterfaceC0850j0 {
        public a() {
            super(C0800b.DEFAULT_INSTANCE);
        }
    }

    static {
        C0800b c0800b = new C0800b();
        DEFAULT_INSTANCE = c0800b;
        GeneratedMessageLite.m3126o(C0800b.class, c0800b);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public static void m3045q(C0800b c0800b, Set set) {
        if (!c0800b.strings_.mo3193j0()) {
            C0871u.c<String> cVar = c0800b.strings_;
            int size = cVar.size();
            c0800b.strings_ = cVar.mo3165E(size == 0 ? 10 : size * 2);
        }
        List list = c0800b.strings_;
        Charset charset = C0871u.f5935a;
        set.getClass();
        if (set instanceof InterfaceC0879y) {
            List<?> listMo3213k = ((InterfaceC0879y) set).mo3213k();
            InterfaceC0879y interfaceC0879y = (InterfaceC0879y) list;
            int size2 = list.size();
            for (Object obj : listMo3213k) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0879y.size() - size2) + " is null.";
                    int size3 = interfaceC0879y.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            throw new NullPointerException(str);
                        }
                        interfaceC0879y.remove(size3);
                    }
                } else if (obj instanceof ByteString) {
                    interfaceC0879y.mo3211J((ByteString) obj);
                } else {
                    interfaceC0879y.add((String) obj);
                }
            }
        } else {
            if (set instanceof InterfaceC0866r0) {
                list.addAll(set);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : set) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size4) + " is null.";
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            throw new NullPointerException(str2);
                        }
                        list.remove(size5);
                    }
                } else {
                    list.add(obj2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static C0800b m3046r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static a m3047t() {
        C0800b c0800b = DEFAULT_INSTANCE;
        c0800b.getClass();
        return (a) ((GeneratedMessageLite.AbstractC0811a) c0800b.mo3038k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: k */
    public final Object mo3038k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C6405a.f36869a[methodToInvoke.ordinal()]) {
            case 1:
                return new C0800b();
            case 2:
                return new a();
            case 3:
                return new C0872u0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0864q0<C0800b> c0812b = PARSER;
                if (c0812b == null) {
                    synchronized (C0800b.class) {
                        c0812b = PARSER;
                        if (c0812b == null) {
                            c0812b = new GeneratedMessageLite.C0812b<>(DEFAULT_INSTANCE);
                            PARSER = c0812b;
                        }
                        break;
                    }
                }
                return c0812b;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: s */
    public final C0871u.c m3048s() {
        return this.strings_;
    }
}
