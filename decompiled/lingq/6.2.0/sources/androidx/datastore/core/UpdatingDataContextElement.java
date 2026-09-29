package androidx.datastore.core;

import p000.eh0;
import p000.in1;
import p000.jn1;
import p000.kn1;
import p000.y52;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public final class UpdatingDataContextElement implements in1 {
    public static final Companion Companion = new Companion(null);
    private static final String NESTED_UPDATE_ERROR_MESSAGE = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";
    private final DataStoreImpl<?> instance;
    private final UpdatingDataContextElement parent;

    public UpdatingDataContextElement(UpdatingDataContextElement updatingDataContextElement, DataStoreImpl<?> dataStoreImpl) {
        dataStoreImpl.getClass();
        this.parent = updatingDataContextElement;
        this.instance = dataStoreImpl;
    }

    public final void checkNotUpdating(DataStore<?> dataStore) {
        dataStore.getClass();
        if (this.instance == dataStore) {
            throw new IllegalStateException(NESTED_UPDATE_ERROR_MESSAGE.toString());
        }
        UpdatingDataContextElement updatingDataContextElement = this.parent;
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(dataStore);
        }
    }

    @Override // p000.kn1
    public /* bridge */ <R> R fold(R r, zi3 zi3Var) {
        return (R) eh0.m11140u(this, r, zi3Var);
    }

    @Override // p000.kn1
    public /* bridge */ <E extends in1> E get(jn1 jn1Var) {
        return (E) eh0.m11141v(this, jn1Var);
    }

    @Override // p000.in1
    public jn1 getKey() {
        return Companion.Key.INSTANCE;
    }

    @Override // p000.kn1
    public /* bridge */ kn1 minusKey(jn1 jn1Var) {
        return eh0.m11107D(this, jn1Var);
    }

    @Override // p000.kn1
    public /* bridge */ kn1 plus(kn1 kn1Var) {
        return eh0.m11113J(this, kn1Var);
    }

    public static final class Companion {

        public static final class Key implements jn1 {
            public static final Key INSTANCE = new Key();

            private Key() {
            }
        }

        public /* synthetic */ Companion(y52 y52Var) {
            this();
        }

        public final String getNESTED_UPDATE_ERROR_MESSAGE$datastore_core() {
            return UpdatingDataContextElement.NESTED_UPDATE_ERROR_MESSAGE;
        }

        private Companion() {
        }
    }
}
