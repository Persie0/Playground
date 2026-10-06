package android.support.wearable.watchface.decomposition;

import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class BaseComponent implements WatchFaceDecomposition.Component {

    /* JADX INFO: renamed from: a */
    protected final Bundle f1404a;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    abstract class BaseBuilder {
        public BaseBuilder() {
            new Bundle();
        }
    }

    /* JADX INFO: compiled from: PG */
    interface ComponentFactory {
    }

    public BaseComponent(Bundle bundle) {
        this.f1404a = bundle;
    }
}
