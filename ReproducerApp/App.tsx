/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */

import {
  Button,
  StatusBar,
  StyleSheet,
  useColorScheme,
  View,
} from 'react-native';
import { SafeAreaProvider } from 'react-native-safe-area-context';
import NativeExceptionTest from './specs/NativeExceptionTest';

function App() {
  const isDarkMode = useColorScheme() === 'dark';

  return (
    <SafeAreaProvider>
      <StatusBar barStyle={isDarkMode ? 'light-content' : 'dark-content'} />
      <AppContent />
    </SafeAreaProvider>
  );
}

function AppContent() {
  return (
    <View style={styles.container}>
      <View style={styles.content}>
        <Button
          title="Non Void Function"
          onPress={() => NativeExceptionTest.nonVoidFunction()}
        />
        <Button
          title="Void Function"
          onPress={() => NativeExceptionTest.voidFunction()}
        />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  content: {
    marginTop: 125,
    flexDirection: 'column',
    gap: '25',
  },
});

export default App;
