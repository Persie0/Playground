package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import mn.C7648e;
import p466wn.AbstractC9984g;
import p466wn.InterfaceC9985h;

/* JADX INFO: loaded from: classes2.dex */
public interface MemberScope extends InterfaceC9985h {

    /* JADX INFO: renamed from: a */
    public static final Companion f39666a = Companion.f39667a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f39667a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC2052l<C7648e, Boolean> f39668b = new InterfaceC2052l<C7648e, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(C7648e c7648e) {
                C5207g.m11111f(c7648e, "it");
                return Boolean.TRUE;
            }
        };
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$a */
    public static final class C7015a extends AbstractC9984g {

        /* JADX INFO: renamed from: b */
        public static final C7015a f39670b = new C7015a();

        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: a */
        public final Set<C7648e> mo11903a() {
            return EmptySet.f38034a;
        }

        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: d */
        public final Set<C7648e> mo11906d() {
            return EmptySet.f38034a;
        }

        @Override // p466wn.AbstractC9984g, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        /* JADX INFO: renamed from: f */
        public final Set<C7648e> mo11907f() {
            return EmptySet.f38034a;
        }
    }

    /* JADX INFO: renamed from: a */
    Set<C7648e> mo11903a();

    /* JADX INFO: renamed from: b */
    Collection mo11904b(C7648e c7648e, NoLookupLocation noLookupLocation);

    /* JADX INFO: renamed from: c */
    Collection mo11905c(C7648e c7648e, NoLookupLocation noLookupLocation);

    /* JADX INFO: renamed from: d */
    Set<C7648e> mo11906d();

    /* JADX INFO: renamed from: f */
    Set<C7648e> mo11907f();
}
