package androidx.datastore.preferences.core;

import java.util.Map;
import kotlin.collections.AbstractC3194a;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public abstract class Preferences {

    public static final class Key<T> {
        private final String name;

        public Key(String str) {
            str.getClass();
            this.name = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Key) {
                return fa4.m11650l(this.name, ((Key) obj).name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        /* JADX INFO: renamed from: to */
        public final Pair<T> m2048to(T t) {
            return new Pair<>(this, t);
        }

        public String toString() {
            return this.name;
        }
    }

    public static final class Pair<T> {
        private final Key<T> key;
        private final T value;

        public Pair(Key<T> key, T t) {
            key.getClass();
            this.key = key;
            this.value = t;
        }

        public final Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public abstract Map<Key<?>, Object> asMap();

    public abstract <T> boolean contains(Key<T> key);

    public abstract <T> T get(Key<T> key);

    public final MutablePreferences toMutablePreferences() {
        return new MutablePreferences(AbstractC3194a.m15372Y(asMap()), false);
    }

    public final Preferences toPreferences() {
        return new MutablePreferences(AbstractC3194a.m15372Y(asMap()), true);
    }
}
